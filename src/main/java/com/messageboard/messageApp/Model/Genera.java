package com.messageboard.messageApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "genera", uniqueConstraints = @UniqueConstraint(name = "genera_unique", columnNames = "genera")
)
public class Genera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int genera_id;
    @Column(nullable = false)
    String genera;
}

//<a routerLink="/Service/Sign_in"><button class="btn btn-success pull-right" >