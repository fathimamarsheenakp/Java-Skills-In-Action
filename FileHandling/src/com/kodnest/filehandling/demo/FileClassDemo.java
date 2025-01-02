package com.kodnest.filehandling.demo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileClassDemo {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\fathi\\Java\\File\\important.txt";
		
		File file = new File(path);
		System.out.println("Get Absolute Path : " + file.getAbsolutePath());
		System.out.println("Is Hidden? -> " + file.isHidden());
		System.out.println("Is File? -> " + file.isFile());
		System.out.println("Can Read? -> " + file.canRead());
		System.out.println("Can Execute? -> " + file.canExecute());
		System.out.println("Can Write? -> " + file.canWrite());
		System.out.println("Name of The File : " + file.getName());
		System.out.println("Parent of The File : " + file.getParent());
		System.out.println("Canonical path : " + file.getCanonicalPath());
		System.out.println("Path : " + file.getPath());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.print("Hello, Welcome ");
		System.err.println(name);
	}
}
