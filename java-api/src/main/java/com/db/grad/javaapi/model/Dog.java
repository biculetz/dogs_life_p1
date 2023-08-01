package com.db.grad.javaapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dogs")
public class Dog
{
    @Id
    private long id;
    private String name;



    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    private long age;

    /*private long owner_id;*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
