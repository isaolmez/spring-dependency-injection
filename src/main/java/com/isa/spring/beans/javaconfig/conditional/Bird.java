package com.isa.spring.beans.javaconfig.conditional;

public class Bird {

    private final Beak beak;

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
