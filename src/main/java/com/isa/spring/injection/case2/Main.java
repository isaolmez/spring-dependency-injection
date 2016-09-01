package com.isa.spring.injection.case2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		/**
		 * Property based injection. Beans are registered in Configuration class; but wired with annotations(@autowired). 
		 * No componentscan is needed.
		 */
		Bird bird = (Bird) context.getBean("birdBean");
//		Bird bird = (Bird) context.getBean(Bird.class);
		bird.printBeak();
		
		
	}
}
