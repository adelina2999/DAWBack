package com.labproiect.demo.controller;

import com.labproiect.demo.service.PastaBusiness;
import com.labproiect.demo.view.entity.PastaView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PastaController {

    private final PastaBusiness pastaBusiness;

    @GetMapping("/pastas")
    public List<PastaView> getPastas() {
        return pastaBusiness.getPasta();
    }

}
