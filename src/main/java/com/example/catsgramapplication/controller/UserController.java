package com.example.catsgramapplication.controller;

import com.example.catsgramapplication.model.User;
import com.example.catsgramapplication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;


    @GetMapping
    public Collection<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/users/{userEmail}")
    public User findUserByEmail(@PathVariable String userEmail) {
        return userService.findUserByEmail(userEmail);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
}
