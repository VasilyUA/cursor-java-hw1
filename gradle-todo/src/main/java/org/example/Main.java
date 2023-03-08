package org.example;

public class Main {
    public static void main(String[] args) {
        Todo todo = new Todo();
        todo.setId(1);
        todo.setTitle("Hello world!");
        todo.setDescription("This is a description");
        todo.setCompleted(true);
        System.out.println(todo);
        System.out.println("Hello world!");
    }
}