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