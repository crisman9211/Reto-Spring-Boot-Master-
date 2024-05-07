package com.retospracticoscrisman9211.masterspringboot.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import com.retospracticoscrisman9211.masterspringboot.domain.WelcomeNamePayload;


public class WelcomeNameServiceTest {
    // private static final Logger logger = LoggerFactory.getLogger(WelcomeNameServiceTest.class);
    @InjectMocks
    WelcomeNameService welcomeName;

    @BeforeEach
    void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void whenNameNotNUll_thenReturnsWelcomeName(){
        // Given
        String name = "Crisman";
        String expected = "Hola Crisman, bienvenido a Spring Boot";
        // When
        String result = welcomeName.welcomeName(new WelcomeNamePayload(name)).name().toString();
        // print result in console to check
        // logger.info("result: " + result);

        // Then

        assert result.equals(expected);
    }


}
