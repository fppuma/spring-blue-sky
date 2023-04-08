package com.example.web.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

  @GetMapping("add-todo")
  public String addTodo() {
    return "addTodo";
  }

  @PostMapping("add-todo")
  public String processTodo(@RequestParam String description, 
    ModelMap model) {
    String username = (String)model.get("username");
    this.todoService.addTodo(username, 
      description,
      LocalDate.now().plusYears(1),
      false);
    return "redirect:todo-list";
  }
}
