package com.ebac.userms.service;

import com.ebac.userms.entity.User;
import com.ebac.userms.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    Logger logger = (Logger) LogManager.getLogger(UserService.class);

    @Autowired
    private  UserRepository repository;


    /**
     * Creates a new user in the repository.
     *
     * @param user The user object to be created.
     * @return The created user object.
     */
    public User create(User user) {
        logger.info("\u001B[34mNew User: " + user.getName() + "\u001B[0m");
        return repository.save(user);
    }

    /**
     * Retrieves all users from the repository.
     *
     * @return A list of all users.
     */
    public List<User> getAll() {
        logger.info("\u001B[34mList of Users: " + repository.count() + "\u001B[0m");
        return repository.findAll();
    }

    /**
     * Retrieves a user by their ID.
     *
     * @param  id  the ID of the user to retrieve
     * @return     the user with the specified ID
     */
    public User getUser(Long id) {
        logger.info("\u001B[34mSearching User: " + id + "\u001B[0m");
        return repository.findById(id).get();
    }

    /**
     * Deletes a user with the specified ID.
     *
     * @param  id  the ID of the user to delete
     */
    public void delete(Long id) {
        logger.info("\u001B[34mDeleting User: " + id + "\u001B[0m");
        repository.deleteById(id);
    }
}
