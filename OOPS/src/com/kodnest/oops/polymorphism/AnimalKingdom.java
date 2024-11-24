package com.kodnest.oops.polymorphism;

public class AnimalKingdom {

	public static void acceptAnimal(Animal animal) {
		animal.eat();
		animal.sleep();
		animal.foodHabit();
	}
}
