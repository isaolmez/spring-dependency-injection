package com.isa.spring.injection.case3;

import org.springframework.stereotype.Component;

@Component
public abstract class Beak {
	public void printBeak() {
		System.out.println("Ordinary beak!");
	}
}
