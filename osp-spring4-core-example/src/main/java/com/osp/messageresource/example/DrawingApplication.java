package com.osp.messageresource.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		System.out.println("Spring Annotaion Objects Example");
		context = new ClassPathXmlApplicationContext("messageResourceContext.xml");
		
		Shape shape = (Shape)context.getBean("circle");
	        	  shape.draw();
	        	  
	        	//  System.out.println(context.getMessage("greeting", null, "Default Message", null));
	}
}