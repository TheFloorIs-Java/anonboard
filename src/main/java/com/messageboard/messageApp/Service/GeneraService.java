package com.messageboard.messageApp.Service;

import com.messageboard.messageApp.Model.Genera;
import com.messageboard.messageApp.Repository.GeneraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneraService {
    private GeneraRepo generaRepo;

    @Autowired
    public GeneraService(GeneraRepo generaRepo){
        this.generaRepo = generaRepo;
    }

    //add genera functionality
    //get all genera
    //get genera by genera return t/f dependent on if already exists
    public Genera addGenera(Genera genera){
        return this.generaRepo.save(genera);
    }
    public List<Genera> getAllGenera(){
        return this.generaRepo.findAll();
    }
    public Genera getGeneraByName(String genera){
        return this.generaRepo.findGeneraByGenera(genera).get();
    }
}
