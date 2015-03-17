package com.struts2.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.struts2.model.BlogPost;

public class BlogPostDao {

	@SessionTarget
	Session session;

	@TransactionTarget
	Transaction transaction;

	@SuppressWarnings("unchecked")
	public List<BlogPost> getPosts() {
		List<BlogPost> posts = new ArrayList<BlogPost>();
		try {
			posts = session.createQuery("from BlogPost").list();
			if (posts == null)
				posts = Collections.EMPTY_LIST;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return posts;
	}

	public void addPost(BlogPost post) {
		session.save(post);
	}
}
