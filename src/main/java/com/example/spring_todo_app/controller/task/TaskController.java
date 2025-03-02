package com.example.spring_todo_app.controller.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.spring_todo_app.service.task.TaskService;

@Controller
public class TaskController {

    private final TaskService taskService = new TaskService();

    @GetMapping("/tasks")
    public String list(Model model) {

        model.addAttribute("taskList", taskService.find());
        return "task/list";
    }
}
