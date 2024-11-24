package com.kodnest.oops.innerclass;

// LOCAL INNER CLASS

public class Worker {

	String name;
	int age;
	int salary;
	
	void work() {
		System.out.println(name + " is working");
	}
	
	void workSchedule() {
		
		class Schedule {
			int fh;
			int sh;
			int pwh;
			public Schedule(int fh, int sh, int pwh) {
				super();
				this.fh = fh;
				this.sh = sh;
				this.pwh = pwh;
			}
			
			void workHour() {
				System.out.println("WORK HOURS:");
				System.out.println("First: " + fh + " Post Lunch: " + sh + " Late work: " + pwh);
				System.out.println("=======================================================");
			}
		}
		
		Schedule schedule = new Schedule(12, 5, 11);
		schedule.workHour();
		
	}

	public Worker(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	void diplayDetails() {
		System.out.println("WORKER DETAILS: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
}
