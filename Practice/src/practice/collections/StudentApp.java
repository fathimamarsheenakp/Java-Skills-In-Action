package practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		System.out.println("Enter size of the list");
		int n = sc.nextInt();
		
		System.out.println("Enter id, name and grade respectively to add the student details to the list");
		
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			char grade = sc.next().charAt(0);
			Student s = new Student(id, name, grade);
			studentList.add(s);
		}
		System.out.println("Student List: ");
		Iterator<Student> itr;
		itr = studentList.iterator();
		while (itr.hasNext()) {
			Student element = itr.next();
			System.out.println(element);
		}
		System.out.println();
		Collections.sort(studentList);
		itr = studentList.iterator();
		System.out.println("Sorted List: ");
		while (itr.hasNext()) {
			Student element = itr.next();
			System.out.println(element);
		}
		System.out.println();
		
		HashSet<Student> studentSet = new HashSet<Student>();
		itr = studentList.iterator();
		while (itr.hasNext()) {
			Student element = itr.next();
			studentSet.add(element);
		}
		
		
		System.out.println("Student Set : ");
		itr = studentSet.iterator();
		while (itr.hasNext()) {
			Student element = itr.next();
			System.out.println(element);
		}
		System.out.println();
		
		HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();
		for (Student s : studentList) {
			studentMap.put(s.id, s);
		}
		
		System.out.println("Student Map: ");
		for (Map.Entry<Integer, Student> entry: studentMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
