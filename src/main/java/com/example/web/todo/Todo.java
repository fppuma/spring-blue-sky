package com.example.web.todo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
  private int id;
  private String username;
  private String description;
  private LocalDate targetDate;
  private boolean done;
}
