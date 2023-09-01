package com.arquiteturacleanspring.controller;

import com.arquiteturacleanspring.service.UserService;
import com.arquiteturacleanspring.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping
    List<User> listAll() {
        return userService.listar();
    }
}