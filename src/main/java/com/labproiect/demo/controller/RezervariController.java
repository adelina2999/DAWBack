package com.labproiect.demo.controller;

import com.labproiect.demo.service.RezervariBusiness;
import com.labproiect.demo.view.entity.RezervariView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RezervariController {

    private final RezervariBusiness rezervariBusiness;

    @PostMapping("/rezervari")
    public RezervariView postRezervari(@RequestBody RezervariView rezervariView) {
        return rezervariBusiness.postRezervari(rezervariView);
    }

}
