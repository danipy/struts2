package com.struts.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.struts2.model.BlogPost;
import com.struts2.model.Comment;

public class PostsRepository {

	public static List<BlogPost> posts = postListDemo();
	
	private static final List<BlogPost> postListDemo() {

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

		BlogPost bp1 = new BlogPost("Paco", "Bacon ipsum dolor sit amet nulla ham qui sint exercitation "
						+ "eiusmod commodo, chuck duis velit. Aute in reprehenderit", commentsBp1);
		BlogPost bp2 = new BlogPost("Pedro", "Bacon ipsum dolor sit amet nulla ham qui sint exercitation "
						+ "eiusmod commodo, chuck duis velit. Aute in reprehenderit", commentsBp2);
		BlogPost bp3 = new BlogPost("De la mar", "Bacon ipsum dolor sit amet nulla ham qui sint exercitation "
						+ "eiusmod commodo, chuck duis velit. Aute in reprehenderit", commentsBp3);
		
		List<BlogPost> list = new ArrayList<BlogPost>();
		
		list.add(bp1);
		list.add(bp2);
		list.add(bp3);
		
		return list;
	}

}
