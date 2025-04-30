package com.example.springinaction.tacoapp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.springinaction.tacoapp.TacoOrder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("/current")
    public String orderForm() {
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid TacoOrder tacoOrder, Errors errors,
                               SessionStatus sessionStatus) {
        if (errors.hasErrors()) {
            log.error("Taco order errors: {}", errors.getAllErrors());
            return "orderForm";
        }
        log.info("Order submitted:{}", tacoOrder);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
