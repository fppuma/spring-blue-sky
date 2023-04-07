package com.example.web.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class LoginController {
  private AuthenticateService authenticateService;

  @GetMapping("login")
  public String loginForm(){
    return "login";
  }

  @PostMapping("login")
  public String processLogin(@RequestParam String username,
    @RequestParam String password) {
    if (this.authenticateService.authenticate(username, password)){
      return "welcome";

    }
    return "login";
  }
}
