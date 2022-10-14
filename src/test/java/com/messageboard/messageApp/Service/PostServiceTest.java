package com.messageboard.messageApp.Service;

import com.messageboard.messageApp.Model.Genera;
import com.messageboard.messageApp.Model.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PostServiceTest {
    @Autowired
    PostService postService;
    @Test
    void addPost(){
        Genera genera = new Genera();
        genera.setGenera_id(1);
        Post post = new Post();
        post.setGenera(genera);
        post.setMessage("This is a test post Message!@#@!");
        post.setTitle("First Post Test");
        postService.addPost(post);
    }
    @Test
    void findPostByPostId(){
        postService.getPostById(1);
        System.out.println(postService.getPostById(1));

    }


}