package com.ebac.userms.controller;

import com.ebac.userms.entity.User;
import com.ebac.userms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memeland")
public class UserController {

    @Autowired
    private UserService service;

    /**
     * Retrieves a list of all users.
     *
     * @return  a list of User objects representing all users
     */
    @GetMapping("/users")
    public List<User> getAll() {
        return service.getAll();
    }

    /**
     * Retrieves a user by their ID.
     *
     * @param  id  the ID of the user to retrieve
     * @return     the User object representing the user with the given ID
     */
    @GetMapping("/users/id={id}")
    public User getUser(@PathVariable Long id) {
        return service.getUser(id);
    }

    /**
     * Creates a new user.
     *
     * @param  user  the user object containing the user details
     * @return       the created user object
     */
    @PostMapping("/newUser")
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    /**
     * Deletes a user with the specified ID.
     *
     * @param  id  the ID of the user to delete
     */
    @DeleteMapping("/users/del/id={id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
