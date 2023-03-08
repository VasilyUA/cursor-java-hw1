package org.example;


import lombok.*;

@Data
public class Todo {
    private int id;
    private String title;
    private String description;
    private boolean completed;
}