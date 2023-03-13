package com.obsqura.main;

import com.obsqura.inheritance.Circle;
import com.obsqura.inheritance.Shape;

public class InheritanceMain {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("test", "blue");
		System.out.println(s1.display());
		
		Circle s2 = new Circle("blue", 5.0);
		System.out.println(s2.print());

	}

}
