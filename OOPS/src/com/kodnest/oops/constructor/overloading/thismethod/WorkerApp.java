package com.kodnest.oops.constructor.overloading.thismethod;

public class WorkerApp {

	public static void main(String[] args) {
		Worker worker = new Worker(500000, 5);
		System.out.println(worker.name + " " + worker.age + " " + worker.salary + " " + worker.rating);
	}
}
