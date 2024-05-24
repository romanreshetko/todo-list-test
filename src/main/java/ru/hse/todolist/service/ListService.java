package ru.hse.todolist.service;

public interface ListService{
    String getTask(String title);

    void addTask(String title, String task);

    void deleteTask(String title);
}
