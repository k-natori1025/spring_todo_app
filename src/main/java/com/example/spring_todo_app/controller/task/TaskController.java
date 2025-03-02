package com.example.spring_todo_app.controller.task;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
    @GetMapping("/tasks")
    public String list(Model model) {
        var task1 = new TaskDto(
                1L,
                "Spring Bootを学ぶ",
                "TODO アプリケーションを作ってみる",
                "対応中");
        var task2 = new TaskDto(
                2L,
                "Spring Securityを学ぶ",
                "TODO アプリケーションを作ってみる",
                "対応中");
        var taskList = List.of(task1, task2);
        model.addAttribute("taskList", taskList);
        return "task/list";
    }
}
