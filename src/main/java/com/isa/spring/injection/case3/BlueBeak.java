package com.isa.spring.injection.case3;

import org.springframework.stereotype.Component;

@Component
public class BlueBeak extends Beak{
	public void printBeak() {
		System.out.println("Blue beak!");
	}
}
