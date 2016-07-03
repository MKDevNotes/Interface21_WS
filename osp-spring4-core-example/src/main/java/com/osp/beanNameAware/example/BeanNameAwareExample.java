package com.osp.beanNameAware.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanNameAwareExample {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beanNameAwareExample.xml");
	Book book = (Book)context.getBean("myBook"); 
	System.out.println("Book Name :"+book.getBookName());
	}
}
