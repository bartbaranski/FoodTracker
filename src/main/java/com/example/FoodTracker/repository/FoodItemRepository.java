package com.example.FoodTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodTracker.model.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    
}
