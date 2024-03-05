package com.example.repository;

import com.example.models.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Integer> {
    // Spring Data JPA generates a whole bunch of queries for CRUD
    // all you need to do is specify specific queries that you want
    // inside of your repository
    Optional<ApplicationUser> findByUsername(String username);
}
