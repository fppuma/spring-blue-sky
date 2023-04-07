package com.example.web.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
  private static List<Todo> todos = new ArrayList<>();

  static{
    todos.add(new Todo(1,"admin", "Learn AWS", 
      LocalDate.now().plusYears(2), false));

    todos.add(new Todo(2,"admin", "Learn Spring", 
      LocalDate.now().plusYears(2), false));

    todos.add(new Todo(3,"admin", "Learn NodeJS", 
      LocalDate.now().plusYears(2), false));
  }

  public List<Todo> findByUsername(String username) {
    return todos;
  }
}
