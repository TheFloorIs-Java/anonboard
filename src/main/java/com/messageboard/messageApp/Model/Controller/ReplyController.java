package com.messageboard.messageApp.Model.Controller;

import com.messageboard.messageApp.Model.Reply;
import com.messageboard.messageApp.Service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReplyController {

    @Autowired
    ReplyService replyService;

    //add reply
    @PostMapping("/reply/add")
    public Reply addReply(@RequestBody Reply reply){
        return replyService.addReply(reply);
    }
    //get all replies for a particular post
    @GetMapping("/reply/{postId}")
    public List<Reply> getAllReplyByParticularPost(@PathVariable Integer postId){
        return replyService.getAllReplyByParticularPost(postId);
    }

}
