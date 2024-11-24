package com.kodnest.oops.abstraction;

public class Airport {

	void acceptPlane(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
