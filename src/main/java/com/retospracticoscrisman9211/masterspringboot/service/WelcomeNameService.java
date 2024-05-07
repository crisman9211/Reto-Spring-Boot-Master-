package com.retospracticoscrisman9211.masterspringboot.service;

import org.springframework.stereotype.Service;

import com.retospracticoscrisman9211.masterspringboot.domain.WelcomeNamePayload;

@Service
public class WelcomeNameService {
    public WelcomeNamePayload welcomeName(WelcomeNamePayload payload) {
        return new WelcomeNamePayload("Hola " + payload.name() + ", bienvenido a Spring Boot");
    }

}
