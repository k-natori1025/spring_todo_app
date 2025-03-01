package com.example.spring_todo_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // localhost:8080 -> "Hello, world!"
    @GetMapping("/")
    public String index() {
        return "index";
    }

}
