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
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int post_id;
    @Column
    String message;
    @Column
    String title;
    @Column
    Date date;

   @ManyToOne()
   @JoinColumn(name = "genera_id", referencedColumnName = "genera_id")
   Genera genera;
}
