package com.example.loginservice.model;

public class Login {

    private String loginId;
    private String loginPassword;

    public Login(String loginId, String loginPassword) {
        this.loginId = loginId;
        this.loginPassword = loginPassword;
    }

    public String getLoginId() {
        return this.loginId;
    }

    public String getLoginPassword() {
        return this.loginPassword;
    }

}
