package com.learn.demo.dao;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.demo.domain.Post;

public class PostDao {
	private List<Post> posts;

	public PostDao(List<Post> posts) {
		this.posts = posts;
	}

	public List<Post> getRecentPosts(int count, int offset) {
		return posts.stream().skip(offset).limit(count).collect(Collectors.toList());
	}

	public List<Post> getAuthorPosts(String author) {
		return posts.stream().filter(post -> author.equals(post.getAuthorId())).collect(Collectors.toList());
	}

	public void savePost(Post post) {
		posts.add(0, post);
	}
}
