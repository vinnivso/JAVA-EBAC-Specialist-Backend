package com.ebac.strangleruserservice.controller;

import com.ebac.strangleruserservice.entity.User;
import com.ebac.strangleruserservice.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    @GetMapping
    public Iterable<User> getAll() {
        return service.getAll();
    }
}
