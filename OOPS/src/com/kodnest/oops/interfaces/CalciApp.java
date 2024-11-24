package com.kodnest.oops.interfaces;

public class CalciApp {
	public static void main(String[] args) {
		Maths maths = new Maths();
		maths.accepCalci(new CasioCalci());
		maths.accepCalci(new EpsonCalci());
	}
}
