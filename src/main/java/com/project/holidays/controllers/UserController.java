package com.project.holidays.controllers;

import com.project.holidays.enums.UserRole;
import com.project.holidays.models.User;
import com.project.holidays.repositories.UserRepository;
import com.project.holidays.repositories.UserRolesRepository;
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

    @Autowired
    UserRolesRepository userRolesRepository;

    @GetMapping("/users")
    public String getUserRole() {
        System.out.println("Getting all users...");

        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);

        String role = userRolesRepository.findByUsername(users.get(0).getUsername()).getRole();

        if (UserRole.ADMIN.toString().equals(role)) {
            return "Super user";
        } else {
            return "Normal user";
        }
    }
}
