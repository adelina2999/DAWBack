package com.labproiect.demo.controller;

import com.labproiect.demo.service.StartereBusiness;
import com.labproiect.demo.view.entity.StartereView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StartereController {

    private final StartereBusiness startereBusiness;

    @GetMapping("/startere")
    public List<StartereView> getStartere() {
        return startereBusiness.getStartere();
    }

}
