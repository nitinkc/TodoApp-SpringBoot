package com.todo.app.controller;

import com.todo.app.model.ToDo;
import com.todo.app.repository.ToDoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

/**
 * Created by nichaurasia on Sunday, December/15/2019 at 1:20 PM
 */
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*")
@CrossOrigin(origins="*", allowedHeaders = "*")
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

    @GetMapping("/{username}/todo/{id}")
    public ToDo getTodosOfUser(@PathVariable String username, @PathVariable Long id){
        return toDoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{username}/todos/{id}")
    public void deleteTodo(@PathVariable String username, @PathVariable Long id){
        toDoRepository.deleteById(id);
    }

    @PutMapping("/{username}/todo/{id}")
    public ToDo updateTodo(@RequestBody ToDo newToDo, @PathVariable Long id){
        return toDoRepository.findById(id)
                .map(toDo -> {
                    toDo.setDescription(newToDo.getDescription());
                    toDo.setTargetDate(newToDo.getTargetDate());
                    return toDoRepository.save(toDo);
                })
                .orElseGet(() -> {
                    newToDo.setId(id);
                    return toDoRepository.save(newToDo);
                });
    }

    @PostMapping("/{username}/todos")
    public ResponseEntity<Object> createTodo(@Valid @RequestBody ToDo toDo){
        System.err.println("###################################### POST Begins ######################################");
        ToDo savedTodo = toDoRepository.save(toDo);
        System.err.println("###################################### POST Ends ######################################");
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedTodo.getId())
                .toUri();

        return (ResponseEntity<Object>) ResponseEntity.created(location).build();
    }

}