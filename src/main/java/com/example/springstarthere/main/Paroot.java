package com.example.springstarthere.main;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Paroot {
    public Paroot(String name) {
        this.name = name;
    }

    public Paroot() {
    }

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }

    private String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = "Cr7";
    }
}
