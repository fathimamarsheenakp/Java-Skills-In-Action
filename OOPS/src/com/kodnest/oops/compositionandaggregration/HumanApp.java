package com.kodnest.oops.compositionandaggregration;

public class HumanApp {

	public static void main(String[] args) {
		Students student = new Students();
		
		student.name = "Ankita";
		student.age = 32;
		student.gender = "Female";
		student.display();
		
		student.name = "Manu";
		student.age = 22;
		student.gender = "Male";
		student.id = 123;
		student.marks = 85;
		student.phone = 789456;
		student.print();
		
		Car cars = new Car();
		student.car = cars;
		student.displayCar();
		
		Engine engines = new Engine();
		student.car.engine = engines;
		student.car.displayEngine();
		
		student.displayBrain();
		student.displayHeart();
		
		Bike bikes = new Bike();
		student.bike = bikes;
		student.displayBike();
		
		
		
	}
}
