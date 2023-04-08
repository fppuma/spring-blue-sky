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

## CSS and JavaScript
Add these dependencies:

```xml
<dependency>
  <groupId>org.webjars</groupId>
  <artifactId>bootstrap</artifactId>
  <version>5.1.3</version>
</dependency>

<dependency>
  <groupId>org.webjars</groupId>
  <artifactId>jquery</artifactId>
  <version>3.6.0</version>
</dependency>
```

These jars come with css and js files
Location: ```META-INF/resources/```  
Files:
- ```webjars/bootstrap/5.1.3/css/bootstrap.min.css```
- ```webjars/bootstrap/5.1.3/js/bootstrap.min.js```
- ```webjars/jquery/3.6.0/jquery.min.js```
