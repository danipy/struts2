package com.struts2.model;

import java.util.Date;

public class Comment {
	private int id;
	private BlogPost post;
	private String comment;
	private Date date;

	public Comment() {
	}

	public Comment(int id, String comment, Date date) {
		super();
		this.id = id;
		this.comment = comment;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public BlogPost getPost() {
		return post;
	}

	public void setPost(BlogPost post) {
		this.post = post;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
