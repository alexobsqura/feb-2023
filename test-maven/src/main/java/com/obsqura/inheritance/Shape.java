package com.obsqura.inheritance;

public class Shape {

	String name;
	String color;
	
	public Shape() {
		super(); // super methods are used to invoke immediate parent class constructor
	}

	public Shape(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String display() {
		return "Name : " + name + ", Color :" + color;
	}

}
