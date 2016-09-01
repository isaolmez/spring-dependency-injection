package com.isa.spring.injection.case3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		/**
		 * Property based injection. Beans are defined with annotations and scanned with @componentscan. Wiring is done with @Qualifier annotation. 
		 * Configuration class is used to place @componentscan. 
		 * 1. If qualifier is not used, you cannot select subclasses. It always selects super class, if it is concrete
		 * 2. If super class is abstract, it expects one sub class; otherwise gives exception.
		 */
		Bird bird = (Bird) context.getBean("bird");
//		Bird bird = (Bird) context.getBean(Bird.class);
		bird.printBeak();
		
	}
}
