package com.ebac.strangleruserservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

import java.util.UUID;

@Entity
public class User {
    @Id
    private String id;

    private String name;

    private String login;

    private Integer age;

    private Integer height;

    @PrePersist
    public void createId() {
        this.id = UUID.randomUUID().toString();
    }

    public User(String name, String login, Integer age, Integer height) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.height = height;
    }

    //# region Getters and Setters

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    //# endregion Getters and Setters
}
