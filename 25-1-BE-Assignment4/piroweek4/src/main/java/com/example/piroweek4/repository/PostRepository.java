package com.example.piroweek4.repository;
import com.example.piroweek4.entity.Post;
import com.example.piroweek4.entity.PostStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByStatus(PostStatus status);
}