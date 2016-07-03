package com.osp.springinterface.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		System.out.println("Spring Interface Objects Example");
		applicationContext = new ClassPathXmlApplicationContext("springInterfaceContext.xml");
		 Shape shape = (Shape)applicationContext.getBean("triangleBean");
	        	  shape.draw();
	}
}

