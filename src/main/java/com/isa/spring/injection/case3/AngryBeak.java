package com.isa.spring.injection.case3;

import org.springframework.stereotype.Component;

@Component
public class AngryBeak extends Beak{
	public void printBeak() {
		System.out.println("Angry beak!");
	}
}
