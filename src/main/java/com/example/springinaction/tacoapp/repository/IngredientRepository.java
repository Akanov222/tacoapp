package com.example.springinaction.tacoapp.repository;

import com.example.springinaction.tacoapp.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, String> {
}
