package com.example.demo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public static String sayHello() {
        System.out.println("Hi team!");

        return "Hi teammates!";
    }
}
