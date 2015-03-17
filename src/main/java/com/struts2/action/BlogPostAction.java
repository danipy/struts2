package com.struts2.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts2.dao.BlogPostDao;
import com.struts2.model.BlogPost;

public class BlogPostAction extends ActionSupport implements
		ModelDriven<BlogPost> {

	private static final long serialVersionUID = -4979903594131005473L;

	private BlogPost blogPost = new BlogPost();
	private List<BlogPost> posts = new ArrayList<BlogPost>();
	private BlogPostDao blogPostDao = new BlogPostDao();

	public BlogPost getModel() {
		return blogPost;
	}

	public BlogPostAction() {
	}

	public String execute() {
		blogPostDao.addPost(blogPost);
		return SUCCESS;
	}

	public BlogPost getBlogPost() {
		return blogPost;
	}

	public void setBlogPost(BlogPost blogPost) {
		this.blogPost = blogPost;
	}

}
