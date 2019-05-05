package com.toyshare.repository;

import java.util.Optional;

import com.toyshare.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User repository for CRUD operations.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
}
