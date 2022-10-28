package com.example.demosecurity.controllers;

import com.example.demosecurity.models.Person;
import com.example.demosecurity.services.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Sobornov Vladimir
 * @since : 27.10.2022
 **/

@Controller
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final RegistrationService registrationService;


    @GetMapping("/login")
    public String login() {
        return "/auth/login";
    }

    @GetMapping("/registration")
    public String registration(@ModelAttribute Person person) {
        return "/auth/registration";
    }

    @PostMapping("/registration")
    public String processRegistration(@ModelAttribute Person person) {
        registrationService.save(person);
        return "redirect:/auth/login";

    }
}
