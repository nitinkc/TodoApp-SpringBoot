package com.todo.app.repository;

import com.todo.app.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nichaurasia on Sunday, December/15/2019 at 1:19 PM
 */

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
