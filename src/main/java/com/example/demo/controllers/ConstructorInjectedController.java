package com.example.demo.controllers;

import com.example.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    // we don't need to tell Spring to autowire the constructor
    // because the constructor instantiates it
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier ("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
