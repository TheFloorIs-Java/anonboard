package com.messageboard.messageApp.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int reply_id;
    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "post_id")
    Post post;
    @Column
    Date date;
    @Column
    String message;
}
