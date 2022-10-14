package com.messageboard.messageApp.Model.Controller;


import com.messageboard.messageApp.Model.Post;
import com.messageboard.messageApp.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin //safety feature
public class PostController {

    @Autowired
    PostService postService;

    //get all post
    @GetMapping("/post/all")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
    //get a certain post
    @GetMapping("/post/{generaId}")
    public List<Post> getParticularPost(@PathVariable int generaId){ //@PathVariable Designates the title that we are getting
        return postService.getParticularPost(generaId);
    }
    //add a post
    @PostMapping("/post/add")
    public Post addPost(@RequestBody Post post){
        return postService.addPost(post);
    }
    @GetMapping("/post/id/{postId}")
    public Post findByPostId(@PathVariable int postId){
        return postService.getPostById(postId);
    }

}
