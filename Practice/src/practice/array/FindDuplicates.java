package practice.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the list");
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter list elements: ");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		getDuplicate(list);
	}
	
	public static void getDuplicate(ArrayList<Integer> list) {
		 HashSet<Integer> set = new HashSet<Integer>();
	        HashSet<Integer> duplicates = new HashSet<Integer>();

	        // Loop through the list to find duplicates
	        for (int ele : list) {
	            if (set.contains(ele)) {
	                duplicates.add(ele);
	            } else {
	                set.add(ele);
	            }
	        }

	        // Print the duplicates in a single line
	        for (int ele : duplicates) {
	            System.out.print(ele + " ");
	        }
	}
}
