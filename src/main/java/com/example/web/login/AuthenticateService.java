package com.example.web.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {
  
  public boolean authenticate(String usernanme, String password) {
    boolean user = usernanme.equals("admin");
    boolean pwd = password.equals("super2a3b");

    return user && pwd;
  }
}
