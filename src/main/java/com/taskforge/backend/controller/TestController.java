package com.taskforge.backend.controller;

import com.taskforge.backend.entity.User;
import com.taskforge.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {

    private final UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/userDetails")
    public List<User> getUserDetails() {
        return userService.getUserDetails();
    }
}