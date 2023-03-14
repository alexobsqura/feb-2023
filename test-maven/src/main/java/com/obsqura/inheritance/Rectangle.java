package com.obsqura.inheritance;

public class Rectangle extends Shape {

	double a, b;

	public Rectangle(String color, double a, double b) {
		super("Rectangle", color);
		this.a = a;
		this.b = b;
	}

	public String display() {

		// super keyword represents parent class object in child class instance methods
		return super.display() + ", Side a : " + a + ", Side b : " + b;
	}

}
