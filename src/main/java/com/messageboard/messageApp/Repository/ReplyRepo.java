package com.messageboard.messageApp.Repository;

import com.messageboard.messageApp.Model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepo extends JpaRepository<Reply, Integer> {

}
