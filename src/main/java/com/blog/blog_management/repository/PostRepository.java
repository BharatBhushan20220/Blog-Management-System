package com.blog.blog_management.repository;

import com.blog.blog_management.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
