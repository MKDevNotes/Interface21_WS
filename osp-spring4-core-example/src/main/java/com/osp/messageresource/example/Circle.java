package com.osp.messageresource.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	/*@Required
	public void setCenter(Point center) {
		this.center = center;
	}*/

	/*@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}*/
	
	
	//JSR 250 Annotation
	/*@Resource(name="pointC")*/
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public Point getCenter() {
		return center;
	}

	public void draw() {
		System.out.println(this.messageSource.getMessage("draw.circle",null, "Default Message", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[]   {center.getX(), center.getY()}, "Default Drawing Greeting", null));
		System.out.println(this.messageSource.getMessage("draw.point", new Object[]   {center.getX(), center.getY()}, "Default Drawing Greeting", null));
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Message", null));
	}
	
	//JSR 250 Annotation
	
	@PostConstruct
	public void initialzeCircle(){
	System.out.println("Initialization of Circle Method");	
	}
	
	@PreDestroy
	public void destoryCircle(){
		System.out.println("destory of Circle Method");	
	}
}
