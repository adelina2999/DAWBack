package com.labproiect.demo.view;

import com.labproiect.demo.view.entity.PizzaView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<PizzaView, Long> {

}
