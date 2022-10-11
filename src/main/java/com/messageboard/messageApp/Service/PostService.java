package com.messageboard.messageApp.Service;

import com.messageboard.messageApp.Model.Post;
import com.messageboard.messageApp.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private PostRepo postRepo;

    @Autowired
    public PostService(PostRepo postRepo){
        this.postRepo = postRepo;
    }

    //addpost
    //getAllPost
    //getParticularPost
    public Post addPost(Post post){
       return this.postRepo.save(post);
    }
    public List<Post> getAllPosts(){
        return this.postRepo.findAll();
    }
    public Post getParticularPost(String postTitle){
        //due to the possibility of a post not existing, use optional
        Optional<Post> optional = this.postRepo.findPostByTitle(postTitle); //created .getPArticularPost method in postRepo
        //check if the post actually is present in the table and if it is return that object of post
        if (optional.isPresent()){
            return optional.get();
        }
        //if it is not present, then return null for all values of Post
        return null;
    }
}
