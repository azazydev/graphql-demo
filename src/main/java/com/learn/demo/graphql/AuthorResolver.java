package com.learn.demo.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.learn.demo.dao.PostDao;
import com.learn.demo.domain.Author;
import com.learn.demo.domain.Post;

public class AuthorResolver implements GraphQLResolver<Author> {
	private PostDao postDao;

	public AuthorResolver(PostDao postDao) {
		this.postDao = postDao;
	}

	public List<Post> getPosts(Author author) {
		return postDao.getAuthorPosts(author.getId());
	}
}
