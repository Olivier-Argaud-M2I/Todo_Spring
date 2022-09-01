package fr.m2i.todospring.controllers;


import fr.m2i.todospring.entities.Hack;
import fr.m2i.todospring.services.HackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller -> pour web Mvc
@RestController // pour les api
@RequestMapping("/hello")
public class HelloController {


    @Autowired
    HackService hackService;

    @GetMapping(path = "/hi")
    public String sayHello(){
        return "hello";
    }


    @GetMapping(
            path = "/hack",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Hack getHack(){

        return hackService.getHack();
    }
}
