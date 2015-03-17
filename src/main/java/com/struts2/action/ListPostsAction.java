package com.struts2.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts2.dao.BlogPostDao;
import com.struts2.model.BlogPost;
import com.struts2.model.Comment;

public class ListPostsAction extends ActionSupport implements
		ModelDriven<BlogPost> {

	private static final long serialVersionUID = 1L;

	private BlogPost post = new BlogPost();
	private List<BlogPost> posts = new ArrayList<BlogPost>();
	private BlogPostDao blogPostDao = new BlogPostDao();

	public BlogPost getModel() {
		return post;
	}

	public ListPostsAction() {
	}

	public ListPostsAction(List<BlogPost> posts) {
		this.posts = posts;
	}

	public String execute() {
		posts = blogPostDao.getPosts();
		if (posts.size() != 0)
			return SUCCESS;
		else
			return ERROR;
	}

	public List<BlogPost> getPosts() {
		return posts;
	}

	public void setPosts(List<BlogPost> posts) {
		this.posts = posts;
	}
	
	private List<BlogPost> postListDemo() {
		
		Comment c1 = new Comment(1, "Bacon ipsum dolor sit amet nulla ham qui sint exercitation "
				+ "eiusmod commodo, chuck duis velit. Aute in reprehenderit", new Date());
		Comment c2 = new Comment(1, "Bacon ipsum dolor sit amet nulla ham qui sint exercitation "
				+ "eiusmod commodo, chuck duis velit. Aute in reprehenderit", new Date());
		Comment c3 = new Comment(1, "Bacon ipsum dolor sit amet nulla ham qui sint exercitation "
				+ "eiusmod commodo, chuck duis velit. Aute in reprehenderit", new Date());
		Comment c4 = new Comment(1, "Bacon ipsum dolor sit amet nulla ham qui sint exercitation "
				+ "eiusmod commodo, chuck duis velit. Aute in reprehenderit", new Date());
		Comment c5 = new Comment(1, "Bacon ipsum dolor sit amet nulla ham qui sint exercitation "
				+ "eiusmod commodo, chuck duis velit. Aute in reprehenderit", new Date());
		Comment c6 = new Comment(1, "Bacon ipsum dolor sit amet nulla ham qui sint exercitation "
				+ "eiusmod commodo, chuck duis velit. Aute in reprehenderit", new Date());
		
		List<Comment> commentsBp1 = new ArrayList<Comment>();
		commentsBp1.add(c1);
		commentsBp1.add(c2);
		commentsBp1.add(c3);

		List<Comment> commentsBp2 = new ArrayList<Comment>();
		commentsBp2.add(c1);
		commentsBp2.add(c3);
		commentsBp2.add(c4);
		commentsBp2.add(c2);
		commentsBp2.add(c6);

		List<Comment> commentsBp3 = new ArrayList<Comment>();
		commentsBp3.add(c5);
		commentsBp3.add(c6);

		BlogPost bp1 = new BlogPost();
		BlogPost bp2 = new BlogPost();
		BlogPost bp3 = new BlogPost();
		
		List<BlogPost> list = new ArrayList<BlogPost>();
		
		list.add(bp1);
		list.add(bp2);
		list.add(bp3);
		
		return list;
	}

}
