package com.osp.constructorInjection.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		System.out.println("Constructor Injection Example");
		applicationContext = new ClassPathXmlApplicationContext("constructorInjectionContext.xml");
		 Triangle triangle = (Triangle)applicationContext.getBean("triangleBean");
	        	  triangle.draw();
	}
}
