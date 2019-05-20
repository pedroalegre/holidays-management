package com.project.holidays.repositories;

import com.project.holidays.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
    List<User> findByUsername(String username);
}
