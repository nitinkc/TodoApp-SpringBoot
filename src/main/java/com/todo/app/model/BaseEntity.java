package com.todo.app.model;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by nichaurasia on Sunday, December/15/2019 at 1:24 PM
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    //Recommendation of Hibernate to use Box Type
    private Long id;
}
