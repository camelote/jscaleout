
package com.stackexchange.api;


public class Owner{
   	private Number accept_rate;
   	private String display_name;
   	private String link;
   	private String profile_image;
   	private Number reputation;
   	private Number user_id;
   	private String user_type;

 	public Number getAccept_rate(){
		return this.accept_rate;
	}
	public void setAccept_rate(Number accept_rate){
		this.accept_rate = accept_rate;
	}
 	public String getDisplay_name(){
		return this.display_name;
	}
	public void setDisplay_name(String display_name){
		this.display_name = display_name;
	}
 	public String getLink(){
		return this.link;
	}
	public void setLink(String link){
		this.link = link;
	}
 	public String getProfile_image(){
		return this.profile_image;
	}
	public void setProfile_image(String profile_image){
		this.profile_image = profile_image;
	}
 	public Number getReputation(){
		return this.reputation;
	}
	public void setReputation(Number reputation){
		this.reputation = reputation;
	}
 	public Number getUser_id(){
		return this.user_id;
	}
	public void setUser_id(Number user_id){
		this.user_id = user_id;
	}
 	public String getUser_type(){
		return this.user_type;
	}
	public void setUser_type(String user_type){
		this.user_type = user_type;
	}
}
