package com.vn.bookservice.command.command;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;



public class CreatedBookCommand {
    @TargetAggregateIdentifier
    private String id;
    private String name;
    private String author;
    private Boolean isReady;

    public CreatedBookCommand(String id, String name, String author, Boolean isReady) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isReady = isReady;
    }

    public CreatedBookCommand() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getIsReady() {
        return isReady;
    }

    public void setReady(Boolean ready) {
        isReady = ready;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + author + " " + isReady;
    }
}
