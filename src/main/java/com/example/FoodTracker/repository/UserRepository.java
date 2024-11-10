package com.example.FoodTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodTracker.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}