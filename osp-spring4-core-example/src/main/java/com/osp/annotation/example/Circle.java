package com.osp.annotation.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	private Point center;

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
