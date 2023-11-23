package com.example.loginservice.controller;

import com.example.loginservice.service.LoginServiceImpl;
import com.example.loginservice.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    LoginServiceImpl loginServiceImpl = new LoginServiceImpl();

    @GetMapping("/login")
    public boolean checkUser(@RequestParam String id, @RequestParam String password) {
        return loginServiceImpl.checkLogin(id, password);
    }

}
