package com.osp.beanlifecycle.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringLifeCycleAnnotation {

	String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	@PostConstruct
	public void customInit() throws Exception 
    {
        System.out.println("Method customInit() invoked...");
    }
 
	@PreDestroy
    public void customDestroy() throws Exception 
    {
        System.out.println("Method customDestroy() invoked...");
    }
	
}
