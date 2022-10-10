package com.messageboard.messageApp.Repository;

import com.messageboard.messageApp.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository <Post, Integer> {

}
