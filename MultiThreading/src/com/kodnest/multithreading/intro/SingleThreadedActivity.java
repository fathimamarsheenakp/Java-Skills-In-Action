package com.kodnest.multithreading.intro;

public class SingleThreadedActivity {

	public static void main(String[] args) {
		new Login().doActivity();
		new Print().doActivity();
		new Add().doActivity();
	}

}
