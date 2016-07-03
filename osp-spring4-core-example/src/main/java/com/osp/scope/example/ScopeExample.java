package com.osp.scope.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("scopeExample.xml");
		
		CustomerService customerServiceA = (CustomerService)context.getBean("customerServiceBean");
		
    	customerServiceA.setMessage("Message by custA");
    	System.out.println("Message : " + customerServiceA.getMessage());
    	
    	
    	CustomerService customerServiceB = (CustomerService)context.getBean("customerServiceBean");
		
    	System.out.println("Message : " + customerServiceB.getMessage());
    	
    	
    	CustomerServiceAnnotation customerServiceC = (CustomerServiceAnnotation)context.getBean("customerServiceAnnotationBean");
		
    	customerServiceC.setMessage("Message by custBD");
    	System.out.println("Message : " + customerServiceC.getMessage());
    	
    	
    	CustomerServiceAnnotation customerServiceD = (CustomerServiceAnnotation)context.getBean("customerServiceAnnotationBean");
		
    	System.out.println("Message : " + customerServiceD.getMessage());
    	
    	
    	
	}
}
