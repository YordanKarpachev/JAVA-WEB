package com.example.ExamPrep.entities.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class UserRegisterDTO {

    @Size(min = 3, max = 10)
    @Column(nullable = false)
    private String userName;

    @Size(min = 5, max = 20)
    @Column(nullable = false)
    private String fullName;

    @Size(min = 5, max = 20)
    @Column(nullable = false)
    private String password;

    private String confirmPassword;

    @Email
    @Column(nullable = false)
    private String email;


    public UserRegisterDTO() {
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
