package com.messageboard.messageApp.Service;

import com.messageboard.messageApp.Model.Genera;
import com.messageboard.messageApp.Repository.GeneraRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class GeneraServiceTest {

    @Autowired
    GeneraRepo generaRepo;
    @Test
    void addGenera(){
        Genera newGenera = new Genera();
        newGenera.setGenera("Test");
        System.out.println(generaRepo.save(newGenera));
    }
    @Test
    void getGenera(){
        System.out.println(generaRepo.findGeneraByGenera("Test").get());
    }
}