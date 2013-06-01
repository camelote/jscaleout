/* Includes */
var restify = require('restify');
var zlib = require('zlib');
var http = require('http');

/* Statics */
var bestObject = null;
var i = 1;
var maxQuery = 30;
var hasMore = true;

/* Functions */
function makeStackOverflowCallAndResponse(res, textToFind) {
   
    http.get("http://api.stackexchange.com/2.1/search/advanced?pagesize=100&page=" + i + "&order=desc&sort=activity&site=stackoverflow&body=" + textToFind, function(response)
		 {
		     switch (response.headers['content-encoding']) {
	             case 'gzip':
			 var gunzip = zlib.createGunzip(), data = ''; 
			 response.pipe(gunzip); 
			 gunzip.on('data', function(chunk) {
			     data += chunk; 
			 }); 
		
			 gunzip.on('end', function() {
			     var myObject = JSON.parse(data, function(key, value) { return value; });
			     if(bestObject == null)
				 bestObject = myObject;
			     else
			     {
				 bestObject.items.concat(myObject.items);
			     }
			     hasMore = myObject.has_more;
			     console.log('Itération ' + ' hasMore ' + myObject.has_more);
			     if(hasMore && i < maxQuery)
				 makeStackOverflowCallAndResponse(res, textToFind);
			     else
			     {
				 res.write(JSON.stringify(bestObject, null, 4));
				 res.end();
			     }
			 }); 
			 break;
	             }
		 }
		).on('error', function(response) {
		    res.send('42');
		});
    
}

function checkStackOverflow(req, res, next) {
    var textToFind = req.params.textToFind;
    makeStackOverflowCallAndResponse(res, textToFind);
}

var server = restify.createServer();
/* Routing action */
server.get('/search/stackoverflow/:textToFind', checkStackOverflow);

server.listen(8080, function() {
  console.log('%s listening at %s', server.name, server.url);
});

