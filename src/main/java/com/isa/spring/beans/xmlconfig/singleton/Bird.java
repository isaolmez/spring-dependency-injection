package com.isa.spring.beans.xmlconfig.singleton;

public class Bird {
	private Beak beak;

	public Bird(){
	}
	
	public Bird(Beak beak) {
		this.beak = beak;
	}

	public Beak getBeak() {
		return beak;
	}
	
	public void setBeak(Beak beak) {
		this.beak = beak;
	}

	public void printBeak() {
		getBeak().printBeak();
	}
}
