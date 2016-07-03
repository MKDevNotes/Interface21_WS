package com.osp.eventlistener.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape,ApplicationEventPublisherAware {

	private Point center;
	private ApplicationEventPublisher publisher;
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
		System.out.println("Drawing Circle ");
		System.out.println("Circle Point is :("+center.getX()+","+center.getY()+")");
		
		DrawEvent event = new DrawEvent(this);
		publisher.publishEvent(event);
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
	
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
	this.publisher=applicationEventPublisher;
	}
}
