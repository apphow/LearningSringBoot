package com.example.demo.controllers;

import com.example.demo.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    // to text this we need the property controller

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        //we're mimicking what Spring is doing by
        //creating a new instance of PrpertyInjectedController
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();

    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}