package com.labproiect.demo.controller;

import com.labproiect.demo.service.PizzaBusiness;
import com.labproiect.demo.view.entity.PizzaView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PizzaController {

    private final PizzaBusiness pizzaBusiness;

    @GetMapping("/pizzas")
    public List<PizzaView> getPizzas() {
        return pizzaBusiness.getPizza();
    }

    @PostMapping("/pizza")
    public PizzaView editPizza(@RequestBody PizzaView pizzaView) {
        return pizzaBusiness.editPizza(pizzaView.getId_pizza(), pizzaView);
    }

}
