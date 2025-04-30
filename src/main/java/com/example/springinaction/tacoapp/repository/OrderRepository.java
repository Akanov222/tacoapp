package com.example.springinaction.tacoapp.repository;

import com.example.springinaction.tacoapp.TacoOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<TacoOrder, Long> {
}
