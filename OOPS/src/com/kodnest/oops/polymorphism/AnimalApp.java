package com.kodnest.oops.polymorphism;

public class AnimalApp {

	public static void main(String[] args) {
		AnimalKingdom.acceptAnimal(new Tiger());
		AnimalKingdom.acceptAnimal(new Monkey());
		AnimalKingdom.acceptAnimal(new Deer());
	}
}
