package com.isa.spring.injection.case3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Bird {
	private Beak randomBeak;
	private int counter = 0;

	public Bird() {
	}
	
	public Bird(Beak beak) {
		this.randomBeak = beak;
	}

	public Beak getBeak() {
		return randomBeak;
	}
	
	@Autowired
//	@Qualifier("blueBeak")
	public void setBeak(Beak beak) {
		this.randomBeak = beak;
	}
	
	public void printBeak(){
		getBeak().printBeak();
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
}
