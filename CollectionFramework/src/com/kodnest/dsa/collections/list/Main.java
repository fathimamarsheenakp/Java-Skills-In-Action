package com.kodnest.dsa.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the number of strings (n)
        System.out.println("Read the number of strings (n)");
         int N = sc.nextInt();
         sc.nextLine();
        // TODO: Create an ArrayList to store integers
        ArrayList arr = new ArrayList();
        // TODO: Add elements to the ArrayList using add() method
        System.out.println("Add elements to the ArrayList");
        for (int i = 0; i <= N-1; i++) {
            arr.add(sc.nextLine().trim());
        }
        // TODO: Read index and new string, insert into ArrayList using add(index, element)
        System.out.println("Read index and new string");
        int index = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine().trim();
        arr.add(index, str);
        // TODO: Print the updated ArrayList
        System.out.print("Updated ArrayList: ");
        for (Object ob : arr) {
            System.out.print(ob + " ");
        }
        sc.close();
    }
}
