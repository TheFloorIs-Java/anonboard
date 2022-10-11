package com.messageboard.messageApp.Service;

import com.messageboard.messageApp.Model.Reply;
import com.messageboard.messageApp.Repository.ReplyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReplyService {
    private ReplyRepo replyRepo;

    @Autowired
    public ReplyService(ReplyRepo replyRepo){
        this.replyRepo = replyRepo;
    }

    //add reply
    //get all reply
    //get specific reply

    //receive a reply from client side and add the reply to the database
    public Reply addReply(Reply reply){
        return this.replyRepo.save(reply);
    }
    //allow client to view all of the replies that are stored in the database
    //for a particular post
    public List<Reply> getAllReplies(){
        //find all instances of this reply and return them from the database
        return this.replyRepo.findAll();
    }

}













//allow the client to submit a search for a particular reply to a post
//    public Reply getSpecificReply(Reply reply){
//        //there may be no related reply matching the users input, so we will use an optional
//        Optional<Reply> optional = this.replyRepo.getSpecificReply(reply);
//        //check to see if requested reply is in the database, if so return it.
//        if(optional.isPresent()){
//            //return optional.get was my issue I didn't get that
//            return optional.get();
//        }
//        //if requested reply does not exist then return null
//        return null;
//    }