package com.messageboard.messageApp.Service;

import com.messageboard.messageApp.Repository.ReplyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyService {
    private ReplyRepo replyRepo;

    @Autowired
    public ReplyService(ReplyRepo replyRepo){
        this.replyRepo = replyRepo;
    }

}
