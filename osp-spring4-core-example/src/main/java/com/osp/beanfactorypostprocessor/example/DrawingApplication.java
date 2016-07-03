package com.osp.beanfactorypostprocessor.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		System.out.println("Injection Objects Example");
		applicationContext = new ClassPathXmlApplicationContext("beanFactoryPostProcessorContext.xml");
		 Triangle triangle = (Triangle)applicationContext.getBean("triangleBean");
	        	  triangle.draw();
	}
}

