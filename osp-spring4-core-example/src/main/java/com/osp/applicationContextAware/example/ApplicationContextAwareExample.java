package com.osp.applicationContextAware.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextAwareExample {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextaware.xml");
		
		Triangle triangle = (Triangle)context.getBean("triangleBean");
		
		triangle.draw();
	}
}
