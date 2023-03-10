package com.obsqura.model;

public class Animal {

	public String name; // instance variable
	public int age;
	public String geneticalName;
	public static int x;

	public Animal() { // default constructor
		System.out.println("Animal Constructor Invoked");
	}

	public Animal(String name, int age) { // parameterised constructor

		System.out.println("Parameterised Constructor Invoked");

		this.name = name; // this represents current object inside instance methods
		this.age = age;
	}

	public Animal(String name, int age, String geneticalName) { // parameterised constructor

		System.out.println("Parameterised Constructor Invoked");

		this.name = name; // this represents current object inside instance methods
		this.age = age;
		this.geneticalName = geneticalName;
	}

	public void display() { // instance method

		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Genetical Name : " + geneticalName);
		System.out.println("x : " + x);

	}
}
