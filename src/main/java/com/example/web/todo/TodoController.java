package com.example.web.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.AllArgsConstructor;

@Controller
@SessionAttributes("username")
@AllArgsConstructor
public class TodoController {

  private TodoService todoService;

  @GetMapping("todo-list")
  public String list(ModelMap model) {
    List<Todo> todos = this.todoService.findByUsername("admin");
    model.put("todos", todos);
    return "todoList";
  }
}
