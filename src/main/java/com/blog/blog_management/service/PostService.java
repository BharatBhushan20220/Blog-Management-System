package com.blog.blog_management.service;

import com.blog.blog_management.entity.Post;

import java.util.List;

public interface PostService {

    Post createPost(Post post);

    Post getPostById(Long id);

    List<Post> getAllPost();

    void deletePost(Long id);

}
