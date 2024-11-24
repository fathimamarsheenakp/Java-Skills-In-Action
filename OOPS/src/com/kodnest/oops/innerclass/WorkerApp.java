package com.kodnest.oops.innerclass;

public class WorkerApp {
	public static void main(String[] args) {
		Worker worker = new Worker("Mina", 22, 250000);
		worker.work();
		worker.workSchedule();
		worker.diplayDetails();
	}
}
