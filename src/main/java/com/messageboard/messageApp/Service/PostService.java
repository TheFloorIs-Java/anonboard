package com.messageboard.messageApp.Service;

import com.messageboard.messageApp.Model.Genera;
import com.messageboard.messageApp.Model.Post;
import com.messageboard.messageApp.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        Date date = new Date();
        post.setDate(date);
       return this.postRepo.save(post);
    }
    public List<Post> getAllPosts(){
        return this.postRepo.findAll();
    }
    public List<Post> getParticularPost(int generaId){
        Genera genera = new Genera();
        genera.setGenera_id(generaId);
        //due to the possibility of a post not existing, use optional
         return this.postRepo.findPostByGenera(genera); //created .getPArticularPost method in postRepo
        //check if the post actually is present in the table and if it is return that object of post

    }
    public Post getPostById(int id){
        if(this.postRepo.findByPostId(id).isPresent()){
            return this.postRepo.findById(id).get();
        }
            return null;
    }
}
