package com.todo.app.controller;

import com.todo.app.model.ToDo;
import com.todo.app.repository.ToDoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nichaurasia on Sunday, December/15/2019 at 1:20 PM
 */

@RestController
@RequestMapping("/users")
public class ToDoController {

    private ToDoRepository toDoRepository;

    //Constructor Injection
    public ToDoController(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @GetMapping("/{username}/todos")
    public List<ToDo> getAllTodosOfUser(@PathVariable String username){
        return toDoRepository.findAll();
    }


}