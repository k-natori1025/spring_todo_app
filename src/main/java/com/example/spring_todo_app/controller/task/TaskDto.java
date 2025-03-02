package com.example.spring_todo_app.controller.task;

public record TaskDto(
        long id,
        String summary,
        String description,
        String status) {
}
