package com.example.spring_todo_app.service.task;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    public List<TaskEntity> find() {
        var task1 = new TaskEntity(
                1L,
                "Spring Bootを学ぶ",
                "TODO アプリケーションを作ってみる",
                TaskStatus.TODO);
        var task2 = new TaskEntity(
                2L,
                "Spring Securityを学ぶ",
                "TODO アプリケーションを作ってみる",
                TaskStatus.DOING);
        return List.of(task1, task2);
    }
}
