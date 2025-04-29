package com.example.springinaction.tacoapp.web;

import com.example.springinaction.tacoapp.Taco;
import com.example.springinaction.tacoapp.TacoOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    @GetMapping("/current")
    public String orderForm() {
        return "orderForm";
    }

    @PostMapping
    public String processOrder(TacoOrder tacoOrder,
                               SessionStatus sessionStatus) {
        log.info("Order submitted:{}", tacoOrder);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
