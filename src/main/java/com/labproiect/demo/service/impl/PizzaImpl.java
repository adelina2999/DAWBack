package com.labproiect.demo.service.impl;

import com.labproiect.demo.service.PizzaBusiness;
import com.labproiect.demo.view.PizzaRepository;
import com.labproiect.demo.view.entity.PizzaView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PizzaImpl implements PizzaBusiness {

    public final PizzaRepository pizzaRepository;

    @Override
    public List<PizzaView> getPizza() {
        return pizzaRepository.findAll();
    }
}
