package com.webapp.webapplication.service;

public class TaskService {
    private final TaskRepository repo;

    public TaskService(TaskRepository repo){
        this.repo = repo;
    }

    public Task addTask(Task task){
        return repo.save(task);
    }

    public List<Task> getTasks(Longer userId){
        return repo.findByUserId(userId);
    }

    public Task toggleTask(Long Id){
        Task task = repo.findById(id).orElseThrow();
        task.setCompleted(!task.isCompleted());
        return repo.save(task);
    }

    public void deleteTask(Long id){
        repo.deleteById(id);
    }
}
