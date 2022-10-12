package com.messageboard.messageApp.Model.Controller;


import com.messageboard.messageApp.Model.Post;
import com.messageboard.messageApp.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    //get all post
    @GetMapping("/post/all")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
//    //get a certain post
//    @GetMapping("/post/{postTitle}")
//    public Post getParticularPost(@PathVariable String postTitle){ //@PathVariable Designates the title that we are getting
//        return postService.getParticularPost(postTitle);
//    }
    //add a post
    @PostMapping("/post/add")
    public Post addPost(@RequestBody Post post){
        return postService.addPost(post);
    }

}
