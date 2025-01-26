package com.app.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.placement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
