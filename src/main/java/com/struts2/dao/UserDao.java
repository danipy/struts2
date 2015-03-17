package com.struts2.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.struts2.model.User;

public class UserDao {
	
	@SessionTarget
	Session session;
	
	@TransactionTarget
	Transaction transaction;

	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		try {
			users = session.createQuery("from User").list();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	public void addUser(User user) {
		session.save(user);
	}
}
