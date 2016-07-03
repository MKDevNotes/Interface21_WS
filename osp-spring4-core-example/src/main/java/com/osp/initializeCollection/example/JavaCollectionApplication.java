package com.osp.initializeCollection.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaCollectionApplication {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		System.out.println("Java Collection Example");
				applicationContext = new ClassPathXmlApplicationContext("initializeCollectionExampleContext.xml");
				JavaCollection collection=(JavaCollection)applicationContext.getBean("javaCollection");
				collection.getAddressList();
				collection.getAddressSet();
				collection.getAddressMap();
	}
}
