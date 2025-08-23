package com.webapp.webapplication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.webapplication.model.Task;
import com.webapp.webapplication.service.TaskService;

@RestController
@RequestMapping
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping
    public Task addTask(@RequestBody Task task){
        return taskService.addTask(task);
    }

    @GetMapping("/{userId}")
    public List<Task> getTasks(@PathVariable Long userId){
        return taskService.getTasks(userId);
    }

    @PutMapping("/{id}/toggle")
    public Task toggleTask(@PathVariable Long id){
        return taskService.toggleTask(id);
    }

    @DeleteMapping
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }
}
