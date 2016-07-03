package com.osp.innerbean.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		System.out.println("Injection Objects Example");
		applicationContext = new ClassPathXmlApplicationContext("innerBeanObjectsContext.xml");
		 Triangle triangle = (Triangle)applicationContext.getBean("triangle-alias");
	        	  triangle.draw();
	}
}
