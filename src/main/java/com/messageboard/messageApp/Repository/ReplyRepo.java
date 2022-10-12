package com.messageboard.messageApp.Repository;

import com.messageboard.messageApp.Model.Post;
import com.messageboard.messageApp.Model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReplyRepo extends JpaRepository<Reply, Integer> {

    List<Reply> findAllReplyByPost(Post post);
   // Optional<Reply> findReplyBy(Reply reply);
}
