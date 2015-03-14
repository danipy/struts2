package com.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.model.BlogPost;

public class BlogPostAction extends ActionSupport {

	private static final long serialVersionUID = -4979903594131005473L;

	private BlogPost blogPost;

	public BlogPostAction() {
	}

	public String execute() {
		blogPost = new BlogPost(blogPost.getUser(), blogPost.getPost());
		return SUCCESS;
	}

	public BlogPost getBlogPost() {
		return blogPost;
	}

	public void setBlogPost(BlogPost blogPost) {
		this.blogPost = blogPost;
	}

}
