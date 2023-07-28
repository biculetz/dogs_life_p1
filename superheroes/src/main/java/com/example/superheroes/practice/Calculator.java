package com.example.superheroes.practice;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @PostConstruct
    public void init() {
        System.out.println("Calculator is created");
    }

    public int addition(int a, int b) {
        return a+b;
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Calculator is destroyed");
    }



}
