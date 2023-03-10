package com.obsqura.main;

import com.obsqura.model.Animal;

public class AnimalMain {

	public static void main(String[] args) {

		Animal.x = 1000; // assign value for static

		Animal a1 = new Animal();
		a1.name = "Dog"; // assign value for instance
		a1.age = 3;
		a1.display();

		Animal a2 = new Animal();
		a2.name = "Cat";
		a2.age = 2;
		a2.display();

		Animal a3 = new Animal("Elephant", 26);
		a3.display();

		Animal a4 = new Animal("Tiger", 12, "Kaduva");
		a4.display();
	}

}
