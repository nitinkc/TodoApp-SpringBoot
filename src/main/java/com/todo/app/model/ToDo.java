package com.todo.app.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by nichaurasia on Sunday, December/15/2019 at 1:17 PM
 */

@Entity
@Table(name = "todo")
public class ToDo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "targetDate")
    private Date targetDate;
    @Column(name = "isCompleted")
    private boolean isCompleted;

    public ToDo() {
    }

    public ToDo(Long id, String description, Date targetDate, boolean isCompleted) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
