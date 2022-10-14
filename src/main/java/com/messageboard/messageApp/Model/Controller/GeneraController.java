package com.messageboard.messageApp.Model.Controller;


import com.messageboard.messageApp.Model.Genera;

import com.messageboard.messageApp.Service.GeneraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
//from spring MVC marks class as a rest controller
//methods in this class can map the URL request, you can have a request map to a particular method.
public class GeneraController {
    @Autowired
    GeneraService generaService;
    @PostMapping("/genera/save")
    public Genera saveGenera(@RequestBody Genera genera){
        return generaService.addGenera(genera);
    }
    @GetMapping("/genera/all")
    public List<Genera> getAllGenera(){
        return generaService.getAllGenera();
    }
    @GetMapping("/genera")
    public Genera getGeneraByName(@RequestBody Genera genera){
        return generaService.getGeneraByName(genera.getGenera());
    }

}








//
//    @RequestMapping("/hello") //this states that whenever there is an HTTP request to this application
//    //using the /hello url you want the following method to be executed. @RequestMapping is for a get method by default
//    //so by adding /hello to the url this @RequestMapping will execute a method and should return something. in this case
//    //we are returning a string.
//    public String sayHi(){
//        return "Hi";
//
//    }