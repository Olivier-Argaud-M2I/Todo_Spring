package fr.m2i.todospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller -> pour web Mvc
@RestController // pour les api
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(path = "/hi")
    public String sayHello(){
        return "hello";
    }
}
