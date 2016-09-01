package com.isa.spring.injection.case4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.case4.xml");
		/**
		 * Property based injection
		 */
		Bird bird = (Bird) context.getBean("bird");
		bird.printBeak();
		System.out.println(bird.getCounter());
		
	}
}
