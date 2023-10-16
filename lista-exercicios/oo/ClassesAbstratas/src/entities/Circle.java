package entities;

import entities.enums.Color;

public class Circle extends Shape{
	
	private double radius;
	private static double PI = 3.14;
	
	public Circle() {
		
	}
	
	public Circle(Color color, double radius) {
		super.color = color;
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.pow(radius, 2)*PI;
	}

	@Override
	public String toString() {
		return "Circle:"+ area() +
			"\nColor:"+ getColor();
	}
	
}
