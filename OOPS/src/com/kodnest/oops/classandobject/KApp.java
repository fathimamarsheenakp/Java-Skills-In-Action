package com.kodnest.oops.classandobject;

public class KApp {

	public static void main(String[] args) {

		User user = new User();
		user.name = "Omkar";
		user.id = 007;
		user.email = "omkar123@kod.in";
		user.password = "om123";
		user.course = "Java";
		user.phone = 9977882244l;
		
		user.login();
		user.joinClass();
		user.markAttendance(10);

	}

}
