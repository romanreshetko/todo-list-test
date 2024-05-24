package ru.hse.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.hse.todolist.api.ListApi;

@RestController
public class ListController implements ListApi {

    @Override
    @GetMapping("/get")
    public String getTask(@RequestParam String title) {
        return null;
    }

    @Override
    @PostMapping("/add")
    public void addTask(String title, String task) {

    }

    @Override
    public void deleteTask(String title) {

    }
}
