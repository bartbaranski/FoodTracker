package com.example.FoodTracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private int calories;

    // Getters and setters
    public Long getId() {
        return id;
    }
    
    public Long setId(Long id) {
        return this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public String setName(String name) {
        return this.name = name;
    }

    public int getCalories() {
        return calories;
    }
    
    public int setCalories(int calories) {
        return this.calories = calories;
    }
}
