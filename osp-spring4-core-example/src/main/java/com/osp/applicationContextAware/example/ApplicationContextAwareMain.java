package com.osp.applicationContextAware.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextAwareMain {
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("applicationContextawareExample.xml");
		ApplicationContextAwareTest appContext = (ApplicationContextAwareTest)context.getBean("appcontext");
		ApplicationContext appCon = appContext.getContext();
		
		SpringTestMessage message = (SpringTestMessage)appCon.getBean("testA");
		message.doTask();
		
	
	}
}
