package com.struts2.model;

import java.util.List;

public class BlogPost {

	private String id;
	private String user;
	private String post;
	private List<Comment> comments;

	public BlogPost() {
	}

	public BlogPost(String user, String post) {
		this.user = user;
		this.post = post;
	}

	public BlogPost(String user, String post, List<Comment> comments) {
		this.user = user;
		this.post = post;
		this.comments = comments;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
