package com.example.ExamPrep.services;

import com.example.ExamPrep.entities.DTO.UserRegisterDTO;
import com.example.ExamPrep.entities.User;
import com.example.ExamPrep.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean registerUser(UserRegisterDTO userRegisterDTO) {
        User user = new User();
        user.setUserName(userRegisterDTO.getUserName());
        user.setEmail(userRegisterDTO.getEmail());
        user.setPassword(userRegisterDTO.getPassword());
        user.setFullName(userRegisterDTO.getFullName());
        this.userRepository.save(user);

        return true;
    }




}
