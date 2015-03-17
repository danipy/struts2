package com.struts2.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.struts2.model.Comment;

public class CommentDao {

	@SessionTarget
	Session session;

	@TransactionTarget
	Transaction transaction;

	@SuppressWarnings("unchecked")
	public List<Comment> getComments() {
		List<Comment> posts = new ArrayList<Comment>();
		try {
			posts = session.createQuery("from Comment").list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return posts;
	}

	public void addComment(Comment comment) {
		session.save(comment);
	}
}
