package com.example.springstarthere.main;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;

    @Autowired
    private Paroot paroot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Paroot getParoot() {
        return paroot;
    }

    public void setParoot(Paroot paroot) {
        this.paroot = paroot;
    }
}
