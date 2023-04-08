# spring-blue-sky
Spring Boot 3 and Java 17

## Login Process
In the LoginController with @Controller annotation.
```java
  @PostMapping("login")
  public String processLogin(@RequestParam String username,
    @RequestParam String password) {
    if (this.authenticateService.authenticate(username, password)){
      return "welcome";

    }
    return "login";
  }
```

In the login.jsp
```html
<form method="post">
  Username: <input type="text" name="username"/> <br>
  Password: <input type="password" name="password"/><br>
  <input type="submit">
</form>
```

## Todo List
- Todo.java (entity)
- TodoService.java (service)
- TodoController.java (controller)
- todoList.jsp (front-page)

Controller. Gets the list of todos and set in the model.
```java
@GetMapping("todo-list")
public String list(ModelMap model) {
  List<Todo> todos = this.todoService.findByUsername("admin");
  model.put("todos", todos);
  return "todoList";
}
```

## Session Attributes
Use this annotation at class level.
```
@SessionAttributes("username")
```

