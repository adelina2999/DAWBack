package com.labproiect.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ControllerTest {

    @GetMapping("/test")
    public String test(){
        return "Test";
    }
}
