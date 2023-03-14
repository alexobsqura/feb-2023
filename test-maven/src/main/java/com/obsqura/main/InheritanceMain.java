package com.obsqura.main;

import com.obsqura.inheritance.Circle;
import com.obsqura.inheritance.Rectangle;
import com.obsqura.inheritance.Shape;

public class InheritanceMain {

	public static void main(String[] args) {

		Shape s1 = new Shape("test", "blue");
		System.out.println(s1.display());

		Circle s2 = new Circle("blue", 5.0);
		System.out.println(s2.display());

		Rectangle s3 = new Rectangle("red", 5.0, 6.5);
		System.out.println(s3.display());

		Shape s4 = new Circle("Green", 1.5); // up casting
		System.out.println(s4.display());

	}

}
