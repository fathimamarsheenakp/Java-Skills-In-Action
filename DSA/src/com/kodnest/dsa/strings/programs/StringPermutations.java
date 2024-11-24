package com.kodnest.dsa.strings.programs;

import java.util.Scanner;

public class StringPermutations {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Generate and print all permutations
        generatePermutations(input, 0, input.length() - 1);
        
        scanner.close();
    }
    
    // Function to generate all permutations of the given string
    public static void generatePermutations(String str, int start, int end) {
        // Base case: if we have considered all characters
        if (start == end) {
            System.out.println(str);  // Print the permutation
        } else {
            // Generate permutations by swapping each character
            for (int i = start; i <= end; i++) {
                // Swap characters at positions start and i
                str = swap(str, start, i);
                
                // Recurse for the next part of the string
                generatePermutations(str, start + 1, end);
                
                // Backtrack by swapping back the characters
                str = swap(str, start, i);
            }
        }
    }

    // Function to swap characters in a string
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();  // Convert string to character array
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);  // Convert the character array back to a string
    }

    
}

