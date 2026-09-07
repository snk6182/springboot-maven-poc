package com.example.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
            "application", "springboot-maven-poc",
            "message", "Hello from Spring Boot!",
            "status", "UP"
        );
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from the Maven Spring Boot POC!";
    }
}
