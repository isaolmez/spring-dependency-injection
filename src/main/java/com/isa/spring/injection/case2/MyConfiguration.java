package com.isa.spring.injection.case2;

import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class MyConfiguration {
	@Bean
	public Beak beakBean(){
		return new YellowBeak();
	}
	
	@Bean
	public Bird birdBean(){
		return new Bird();
	}
}
