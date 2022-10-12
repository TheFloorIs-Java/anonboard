package com.messageboard.messageApp.Service;

import com.messageboard.messageApp.Model.Post;
import com.messageboard.messageApp.Model.Reply;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // lets spring know that this is a test


class ReplyServiceTest {
    @Autowired //this allows spring to know to pass in the object, no need to create a new Object
    ReplyService replyService;
    @Test
    void addReply(){
        Post post = new Post();
        post.setPost_id(1);
        Reply reply = new Reply();
        reply.setMessage("This is the first reply");
        reply.setPost(post);
        replyService.addReply(reply);


    }



}