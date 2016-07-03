package com.osp.beanlifecycle.example;

public class CustomBeanLifeCycle {

		String message;
		
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	  public void customInit() 
	    {
	        System.out.println("Method customInit() invoked...");
	    }
	 
	    public void customDestroy() 
	    {
	        System.out.println("Method customDestroy() invoked...");
	    }
	
}
