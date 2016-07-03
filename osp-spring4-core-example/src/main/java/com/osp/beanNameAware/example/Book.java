package com.osp.beanNameAware.example;

import org.springframework.beans.factory.BeanNameAware;

public class Book implements BeanNameAware {

	private String bookName;
	
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println(beanName+" bean name has been initialized.");
	}
	
	public Book(String bookName) {
		System.out.println("--Inside Constructor--");
		this.bookName=bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
}
