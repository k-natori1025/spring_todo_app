package com.example.spring_todo_app.service.task;

public record TaskEntity(
        long id,
        String summary,
        String description,
        TaskStatus status) {

}
