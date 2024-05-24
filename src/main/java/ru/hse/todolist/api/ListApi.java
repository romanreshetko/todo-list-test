package ru.hse.todolist.api;

public interface ListApi {
    String getTask(String title);

    void addTask(String title, String task);

    void deleteTask(String title);
}
