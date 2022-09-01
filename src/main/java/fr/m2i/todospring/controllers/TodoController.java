package fr.m2i.todospring.controllers;


import fr.m2i.todospring.entities.Todo;
import fr.m2i.todospring.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class TodoController {


    @Autowired
    TodoService todoService;


    @GetMapping(
            path = "/all",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Iterable<Todo>getAllTodo(){
        return todoService.getAllTodo();
    }


    @GetMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Todo getTodoById(@PathVariable("id")Long id){
        Optional opt = todoService.getTodo(id);
        if(opt.isPresent()){
            return (Todo) opt.get();
        }
        return null;
    }


    @PostMapping(
            path = "/save",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Todo save(@RequestBody Todo todo){
        return todoService.saveTodo(todo);
    }


    @DeleteMapping(
            path = "/delete",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void delete(@RequestBody Todo todo){
        todoService.deleteTodo(todo);
    }






}
