package com.kodnest.oops.inheritance;

public class PlaneApp {
	public static void main(String[] args) {
		CargoPlane cargoPlane = new CargoPlane();
		cargoPlane.takeOff();
		cargoPlane.fly();
		
		PassengerPlane passenger = new PassengerPlane();
		passenger.takeOff();
		passenger.fly();
		
		FighterPlane fighter = new FighterPlane();
		fighter.takeOff();
		fighter.fly();
	}
}
