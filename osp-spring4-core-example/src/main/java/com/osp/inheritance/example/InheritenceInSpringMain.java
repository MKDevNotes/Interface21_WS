package com.osp.inheritance.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InheritenceInSpringMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("inheritanceContext.xml");
		
		Employee emp=(Employee)context.getBean("employeeBean");
		
		System.out.println("Employee Name :"+emp.getName());
		System.out.println("Employee Name :"+emp.getEmployeNumber());
		
		
		AbstractApplicationContext context2= new ClassPathXmlApplicationContext("inheritanceContext.xml");

		context2.registerShutdownHook();
	}
	
}
