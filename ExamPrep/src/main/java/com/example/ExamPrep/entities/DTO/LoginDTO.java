package com.example.ExamPrep.entities.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;

public class LoginDTO {


    @Size(min = 3, max = 10)
    @Column(nullable = false)
    private String userName;


    @Size(min = 5, max = 20)
    @Column(nullable = false)
    private String password;

    public LoginDTO() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
