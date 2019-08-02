package com.learn.demo.graphql;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.learn.demo.dao.AuthorDao;
import com.learn.demo.domain.Author;
import com.learn.demo.domain.Post;

public class PostResolver implements GraphQLResolver<Post> {
	private AuthorDao authorDao;

	public PostResolver(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	public Optional<Author> getAuthor(Post post) {
		return authorDao.getAuthor(post.getAuthorId());
	}
}
