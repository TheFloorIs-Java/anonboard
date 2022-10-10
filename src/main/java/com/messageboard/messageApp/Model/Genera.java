package com.messageboard.messageApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "genera")
public class Genera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int genera_id;
    @Column
    String genera;
}

