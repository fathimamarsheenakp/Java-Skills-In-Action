package com.kodnest.oops.inheritance.typecasting;

public class PlaneApp {

	public static void main(String[] args) {
		Plane ref;
		ref = new CargoPlane();
		ref.takeOff();
		ref.fly();
		ref.land();
		((CargoPlane)ref).carryCargo();
		
		ref = new PassengerPlane();
		ref.takeOff();
		ref.fly();
		ref.land();
		((PassengerPlane)ref).carryPassenger();
		
		ref = new FighterPlane();
		ref.takeOff();
		ref.fly();
		ref.land();
		((FighterPlane)ref).carryArmy();
		
		
	}
}
