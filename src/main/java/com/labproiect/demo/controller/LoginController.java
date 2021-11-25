package com.labproiect.demo.controller;

import com.labproiect.demo.service.UserBusiness;
import com.labproiect.demo.view.entity.UserView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final UserBusiness userBusiness;

    @GetMapping("/login")
    public UserView getPastas(@RequestParam String login, @RequestParam String password) {
        return userBusiness.getUser(login, password);
    }

}
