package com.example.demo.services;

import com.sun.prism.GraphicsResource;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello-from the Primary Bean";
    }
}
