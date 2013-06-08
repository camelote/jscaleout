
package com.stackexchange.api;

import java.util.List;

public class Items{
   	private Number answer_count;
   	private Number creation_date;
   	private boolean is_answered;
   	private Number last_activity_date;
   	private String link;
   	private Owner owner;
   	private Number question_id;
   	private Number score;
   	private List<String> tags;
   	private String title;
   	private Number view_count;

 	public Number getAnswer_count(){
		return this.answer_count;
	}
	public void setAnswer_count(Number answer_count){
		this.answer_count = answer_count;
	}
 	public Number getCreation_date(){
		return this.creation_date;
	}
	public void setCreation_date(Number creation_date){
		this.creation_date = creation_date;
	}
 	public boolean getIs_answered(){
		return this.is_answered;
	}
	public void setIs_answered(boolean is_answered){
		this.is_answered = is_answered;
	}
 	public Number getLast_activity_date(){
		return this.last_activity_date;
	}
	public void setLast_activity_date(Number last_activity_date){
		this.last_activity_date = last_activity_date;
	}
 	public String getLink(){
		return this.link;
	}
	public void setLink(String link){
		this.link = link;
	}
 	public Owner getOwner(){
		return this.owner;
	}
	public void setOwner(Owner owner){
		this.owner = owner;
	}
 	public Number getQuestion_id(){
		return this.question_id;
	}
	public void setQuestion_id(Number question_id){
		this.question_id = question_id;
	}
 	public Number getScore(){
		return this.score;
	}
	public void setScore(Number score){
		this.score = score;
	}
 	public List<String> getTags(){
		return this.tags;
	}
	public void setTags(List<String> tags){
		this.tags = tags;
	}
 	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
 	public Number getView_count(){
		return this.view_count;
	}
	public void setView_count(Number view_count){
		this.view_count = view_count;
	}
}
