package com.ebac.demomongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document("Game")
public class Game {
    @Id
    private UUID id;

    private String name;

    private String publisher;

    private String developer;

    private String platform;

    public Game(String name, String publisher, String developer, String platform) {
        this.name = name;
        this.publisher = publisher;
        this.developer = developer;
        this.platform = platform;
    }

    //# region Getters and Setters
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    //# endregion Getters and Setters
}
