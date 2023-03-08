package org.example;

public class Main {
    public static void main(String[] args) {
        Todo todo = new Todo(1, "Hello world!", "This is a description", true);
        System.out.println(todo.getTitle());
    }
}