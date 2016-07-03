package com.osp.applicationContextAware.example;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareTest implements ApplicationContextAware{
	
	private ApplicationContext context;
	
	public ApplicationContext getContext() {
		return context;
	}
	
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		// TODO Auto-generated method stub
		this.context=context;
	}
}
