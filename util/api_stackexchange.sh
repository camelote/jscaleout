curl --proxy http://fr-proxy.groupinfra.com:3128 --trace-ascii debug.log "http://api.stackexchange.com/2.1/search/advanced?order=desc&sort=activity&body=great&site=stackoverflow" > result.gz
gunzip result.gz
