package com.example.loginservice.service;

import com.example.loginservice.model.Login;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;

public class LoginServiceImpl{

    ArrayList<Login> loginUsers = new ArrayList<>(Arrays.asList(
            new Login("191180074", "1234")
    ));

    public boolean checkLogin(String id, String password) {
        for (Login loginUser : loginUsers) {
            if (loginUser.getLoginId().compareTo(id) == 0 && loginUser.getLoginPassword().compareTo(password) == 0) {
                return true;
            }
        }
       return false;
    }
}
