package com.learn.demo.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.learn.demo.dao.PostDao;
import com.learn.demo.domain.Post;

public class Query implements GraphQLQueryResolver {
	private PostDao postDao;

    public Query(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> recentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
}