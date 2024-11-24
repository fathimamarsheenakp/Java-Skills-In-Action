package com.kodnest.oops.innerclass;

import com.kodnest.oops.innerclass.Student.Address;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student();
		Student.Address address = student.new Address(42, 6, "Apollo", "Bangalore", "Karnataka", 56006);
		student.setData("Deepa", 23, address);
		student.displayStudentDetails();
//		address.displayAddress();
	}
}
