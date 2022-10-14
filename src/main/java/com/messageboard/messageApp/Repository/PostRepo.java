package com.messageboard.messageApp.Repository;

import com.messageboard.messageApp.Model.Genera;
import com.messageboard.messageApp.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PostRepo extends JpaRepository <Post, Integer> {


    List<Post> findPostByGenera (Genera genera);
    @Query(nativeQuery = true,value = "Select * From post where post_id =?1")
    Optional<Post> findByPostId (int id);
}
