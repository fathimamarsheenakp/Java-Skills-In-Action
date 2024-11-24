package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class StringPermutation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        permute(input,"");
        scanner.close();
    }

    public static void permute(String str, String prefix) {
        int n = str.length();
        if(n == 0) {
            System.out.println(prefix);
        } else {
            for(int i=0;i<n; i++) {
                String newstring = str.substring(0, i) + str.substring(i+1);
                permute(newstring, prefix+str.charAt(i));
            }
        }
    }
}