package com.project.holidays.repositories;

import com.project.holidays.models.UserRoles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRolesRepository extends CrudRepository<UserRoles, Long> {
    List<UserRoles> findByUserId(Integer id);

    UserRoles findByUserRoleId(Integer id);

    UserRoles findByUsername(String username);
}
