package com.isa.case1.singleton;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.singleton.xml");
		/**
		 * Property based injection
		 */
		Bird bird = (Bird) context.getBean("bird");
		bird.printBeak();
		
		
		/**
		 * Constructor based injection
		 */
		Bird bird2 = (Bird) context.getBean("bird2");
		bird2.printBeak();
		
		
		/**
		 * Singleton test
		 */
		System.out.println(bird.getCounter());
		bird.setCounter(10);
		/**
		 * Same object is given again
		 */
		Bird bird_again = (Bird) context.getBean("bird");
		bird_again.printBeak();
		System.out.println(bird_again.getCounter());
		
		/**
		 * Though bird2 and bird beans are not related
		 */
		Bird bird2_again = (Bird) context.getBean("bird2");
		bird2_again.printBeak();
		System.out.println(bird2_again.getCounter());
		
		
		/**
		 * Other configurations
		 */
		
		Bird bird_class = context.getBean(Bird.class);// Fails, because there are two beans with the same class: bird and bird2
		bird_class.printBeak();
		
		context.close();
		
	}
}
