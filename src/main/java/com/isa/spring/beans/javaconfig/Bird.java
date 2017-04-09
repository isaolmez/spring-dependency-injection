package com.isa.spring.beans.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Bird {

    private final Beak beak;

    @Autowired
    public Bird(Beak beak) {
        this.beak = beak;
    }

    public Beak getBeak() {
        return beak;
    }

    public void printBeak() {
        getBeak().printBeak();
    }
}
