package com.example.springinaction.tacoapp;

import com.example.springinaction.tacoapp.repository.IngredientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("test") // Активируем профиль test
class RepositoryTests {

    @Autowired
    private IngredientRepository repo;

    @Test
    void shouldSaveIngredient() {
        Ingredient saved = repo.save(new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP));
        assertNotNull(saved.getId());
    }
}