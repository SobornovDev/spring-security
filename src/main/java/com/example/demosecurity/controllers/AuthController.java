package com.example.demosecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Sobornov Vladimir
 * @since : 27.10.2022
 **/

@Controller
@RequestMapping("/auth")
public class AuthController {


    @GetMapping("/login")
    public String login() {
        return "/auth/login";
    }
}
