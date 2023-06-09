package com.example.web.login;

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
public class LoginController {
  private AuthenticateService authenticateService;

  @GetMapping("login")
  public String loginForm(){
    return "login";
  }

  @PostMapping("login")
  public String processLogin(@RequestParam String username,
    @RequestParam String password,
    ModelMap model) {
    if (this.authenticateService.authenticate(username, password)){
      model.put("username", username);
      return "welcome";
    }
    model.put("errorMessage", "Invalid Credentials");
    return "login";
  }
}
