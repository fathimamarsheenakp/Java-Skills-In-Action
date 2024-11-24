package com.kodnest.dsa.array;
import java.util.Scanner;

class DemoTranspose {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter array elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter indices");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int mul = arr[x] * arr[y];
        System.out.println(mul);
    }
}