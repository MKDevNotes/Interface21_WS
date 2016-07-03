package org.dn.aop.service;

import org.dn.aop.model.Circle;
import org.dn.aop.model.Triangle;

public class ShapeService {
	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	private Circle circle;
	private Triangle triangle;

}
