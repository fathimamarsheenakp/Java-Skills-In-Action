package com.kodnest.oops.constructor.overloading;

public class WorkerApp {

	public static void main(String[] args) {
		Worker worker = new Worker(500000);
		System.out.println(worker.name + " " + worker.age + " " + worker.salary + " " + worker.rating);
	}
}
