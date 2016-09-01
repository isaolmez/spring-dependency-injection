package com.isa.spring.injection.case3;

import org.springframework.stereotype.Component;

@Component
public class YellowBeak extends Beak {
	public void printBeak() {
		System.out.println("Yellow beak!");
	}
}
