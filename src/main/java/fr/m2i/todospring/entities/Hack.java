package fr.m2i.todospring.entities;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hack {

    public String name;
    public String port;
    private String url;
    private String username;
    private String password;

}
