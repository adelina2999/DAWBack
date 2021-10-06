package com.labproiect.demo.controller;

import com.labproiect.demo.service.PizzaBusiness;
import com.labproiect.demo.view.entity.PizzaView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PizzaController {

    private final PizzaBusiness pizzaBusiness;

    @GetMapping("/pizzas")
    public List<PizzaView> getPizzas() {
        return pizzaBusiness.getPizza();
    }

}
