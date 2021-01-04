package com.example.springsecuritysql.model.repository;

import com.example.springsecuritysql.model.entities.AppUser;
import com.example.springsecuritysql.model.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    List<UserRole> findByAppUser(AppUser appUser);

}
