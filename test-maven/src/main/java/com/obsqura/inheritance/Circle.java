package com.obsqura.inheritance;

public class Circle extends Shape {

	double radius;

	public Circle() {
		super();
	}

	public Circle(String color, double radius) {
		super("Circle", color);
		this.radius = radius;
	}

	public String display() {

		// super keyword represents parent class object in child class instance methods
		return super.display() + ", Radius : " + radius;
	}

}
