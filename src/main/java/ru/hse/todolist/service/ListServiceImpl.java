package ru.hse.todolist.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hse.todolist.repository.ListRepository;
import ru.hse.todolist.repository.TaskDB;

@Service
@AllArgsConstructor
public class ListServiceImpl implements ListService {
    private ListRepository listRepository;
    @Override
    public String getTask(String title) {
        return listRepository.getTask(title);
    }

    @Override
    public void addTask(String title, String task) {
        listRepository.addTask(title, task);
    }

    @Override
    public void deleteTask(String title) {
        listRepository.deleteTask(title);
    }
}
