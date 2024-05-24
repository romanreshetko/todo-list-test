package ru.hse.todolist.repository;

import org.springframework.stereotype.Repository;


@Repository
public class TaskDB implements ListRepository {



    @Override
    public void addTask(String title, String task) {

    }

    @Override
    public void deleteTask(String title) {

    }

    @Override
    public String getTask(String title) {
        return "";
    }
}
