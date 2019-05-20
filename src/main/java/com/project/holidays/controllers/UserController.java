package com.project.holidays.controllers;

import com.project.holidays.models.User;
import com.project.holidays.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        System.out.println("Getting all users...");

        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);

        return users;
    }
}
