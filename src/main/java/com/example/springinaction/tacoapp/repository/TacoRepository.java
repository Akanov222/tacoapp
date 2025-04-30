package com.example.springinaction.tacoapp.repository;

import com.example.springinaction.tacoapp.Taco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacoRepository extends JpaRepository<Taco, Long> {
}
