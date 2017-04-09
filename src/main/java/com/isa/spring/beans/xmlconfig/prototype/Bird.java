package com.isa.spring.beans.xmlconfig.prototype;

public class Bird {
	private final Beak beak;

	public Bird(final Beak beak) {
		this.beak = beak;
	}

	public Beak getBeak() {
		return beak;
	}

	public void printBeak() {
		getBeak().printBeak();
	}
}
