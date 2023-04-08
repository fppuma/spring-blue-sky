package com.example.web.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
  private static int todosCount = 0;
  private static List<Todo> todos = new ArrayList<>();

  static{
    todos.add(new Todo(todosCount++,"admin", "Learn AWS", 
      LocalDate.now().plusYears(2), false));

    todos.add(new Todo(todosCount++,"admin", "Learn Spring", 
      LocalDate.now().plusYears(2), false));

    todos.add(new Todo(todosCount++,"admin", "Learn NodeJS", 
      LocalDate.now().plusYears(2), false));
  }

  public List<Todo> findByUsername(String username) {
    return todos;
  }

  public void addTodo(String username, String description, 
    LocalDate targetDate, boolean done) {
      todos.add(new Todo(todosCount++, username, description,
      targetDate, done));
    }
}
