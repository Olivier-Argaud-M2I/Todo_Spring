package fr.m2i.todospring.services;


import fr.m2i.todospring.entities.Todo;
import fr.m2i.todospring.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {


    @Autowired
    TodoRepository todoRepository;

    public Iterable<Todo>getAllTodo(){
        return todoRepository.findAll();
    }

    public Optional<Todo> getTodo(Long id){
        return todoRepository.findById(id);
    }

    public Todo saveTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public void deleteTodo(Todo todo){
        todoRepository.delete(todo);
    }

}
