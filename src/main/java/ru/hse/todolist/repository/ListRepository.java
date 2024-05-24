package ru.hse.todolist.repository;

public interface ListRepository {
    void addTask(String title, String task);

    void deleteTask(String title);

    String getTask(String title);
}
