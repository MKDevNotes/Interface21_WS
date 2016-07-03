package com.osp.eventlistener.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {
	private static AbstractApplicationContext applicationContext;

	public static void main(String[] args) {
		System.out.println("Spring Annotaion Objects Example");
		applicationContext = new ClassPathXmlApplicationContext("eventlistenerContext.xml");
		applicationContext.registerShutdownHook();
		 Shape shape = (Shape)applicationContext.getBean("circle");
	        	  shape.draw();
	}
}

