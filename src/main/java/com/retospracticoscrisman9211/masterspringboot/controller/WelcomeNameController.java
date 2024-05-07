package com.retospracticoscrisman9211.masterspringboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retospracticoscrisman9211.masterspringboot.domain.WelcomeNamePayload;
import com.retospracticoscrisman9211.masterspringboot.service.WelcomeNameService;

@RestController
public class WelcomeNameController {

    private final WelcomeNameService welcomeNameService;

    public WelcomeNameController(WelcomeNameService welcomeNameService) {
        this.welcomeNameService = welcomeNameService;
    }

    // Genera un endpoint REST que reciba por parametro una cadena de texto que representa un nombre. El endpoint debe responder “Hola %nombre, bienvenido a Spring Boot”
    @GetMapping("/welcome")
    public String welcomeName(@RequestParam String name) {
        WelcomeNamePayload payload = new WelcomeNamePayload(name);
        return welcomeNameService.welcomeName(payload).name();
    }
}
