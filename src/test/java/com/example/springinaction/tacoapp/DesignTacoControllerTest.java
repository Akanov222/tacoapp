package com.example.springinaction.tacoapp;

import com.example.springinaction.tacoapp.repository.IngredientRepository;
import com.example.springinaction.tacoapp.web.DesignTacoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(DesignTacoController.class)
class DesignTacoControllerTest {
    @Autowired
    private MockMvc mockMvc;

//    @MockBean
    private IngredientRepository ingredientRepo;

    @Test
    void showDesignForm() throws Exception {
        mockMvc.perform(get("/design"))
                .andExpect(status().isOk())
                .andExpect(view().name("design"));
    }
}
