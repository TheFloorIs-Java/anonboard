package com.messageboard.messageApp.Repository;

import com.messageboard.messageApp.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepo extends JpaRepository <Post, Integer> {


    Optional<Post> findPostByTitle (String postTitle);
}
