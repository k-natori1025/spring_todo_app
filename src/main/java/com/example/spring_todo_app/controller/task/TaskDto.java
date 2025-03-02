package com.example.spring_todo_app.controller.task;

import com.example.spring_todo_app.service.task.TaskEntity;

public record TaskDto(
        long id,
        String summary,
        String description,
        String status) {

    public static TaskDto toDto(TaskEntity entity) {
        return new TaskDto(
                entity.id(),
                entity.summary(),
                entity.description(),
                entity.status().name());
    }
}
