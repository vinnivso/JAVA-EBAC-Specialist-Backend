package com.ebac.strangleruserservice.repository;

import com.ebac.strangleruserservice.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
