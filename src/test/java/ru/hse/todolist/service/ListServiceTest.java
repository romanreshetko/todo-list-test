package ru.hse.todolist.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.hse.todolist.repository.ListRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ListServiceTest {
    @Mock
    private ListRepository listRepository;
    @InjectMocks
    private ListServiceImpl listService;

    @Test
    void addTask__serviceIsCalled() {
        when(listRepository.getTask("title")).thenReturn("text");

        String text = listService.getTask("title");
        assertEquals("text", text);
        verify(listRepository, times(1)).getTask("title");
    }
}
