package fr.m2i.todospring.services;

import fr.m2i.todospring.entities.Hack;
import fr.m2i.todospring.properties.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HackService {


    @Autowired
    MyProperties myProperties;

    public Hack getHack(){
    Hack hack = new Hack(
                myProperties.getName(),
                myProperties.getPort(),
                myProperties.getUrl(),
                myProperties.getUsername(),
                myProperties.getPassword()
        );

    return hack;

    }

}
