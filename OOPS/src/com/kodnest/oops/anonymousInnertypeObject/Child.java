package com.kodnest.oops.anonymousInnertypeObject;

public class Child{
	public static void main(String[] args) {
		Demo demo = new Demo() {

			@Override
			void name() {
				System.out.println("Should say the name");
				
			}

			@Override
			void age() {
				System.out.println("Age should be greater than 18");
				
			}
			
		};
		
		demo.name();
		demo.age();
	}

}
