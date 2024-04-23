package com.ebac.strangleruserservice.service;

import com.ebac.strangleruserservice.entity.User;
import com.ebac.strangleruserservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Iterable <User> getAll() {
        return repository.findAll();
    }

    public User create(User user) {
        return repository.save(user);
    }
}
