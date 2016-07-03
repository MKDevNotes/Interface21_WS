package com.osp.annotation.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {
	private static AbstractApplicationContext applicationContext;

	public static void main(String[] args) {
		System.out.println("Spring Annotaion Objects Example");
		applicationContext = new ClassPathXmlApplicationContext("annotationContext.xml");
		applicationContext.registerShutdownHook();
		 Shape shape = (Shape)applicationContext.getBean("circle");
	        	  shape.draw();
	}
}

