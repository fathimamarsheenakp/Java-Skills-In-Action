package practice.string;

import java.util.Scanner;

public class RegularExpressionMatching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = sc.next();
        System.out.println("Enter the pattern:");
        String pattern = sc.next();

        boolean result = isMatch(text, pattern);
        System.out.println("Does the text match the pattern? " + result);
    }
    
    public static boolean isMatch(String text, String pattern) {
        
        // Base case: If the pattern is empty, the text must also be empty
        if (pattern.isEmpty()) {
            return text.isEmpty();
        }

       
        // Check if the first character matches (considering '.')
        boolean firstMatch = !text.isEmpty() && 
                             (text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.');
        

        // If the pattern contains '*', we have two cases to handle
        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
        	
            // Case 1: Ignore the "x*" part in the pattern
            // Case 2: Consume one character from the text if the first character matches
        	
            return (isMatch(text, pattern.substring(2)) || 
                   (firstMatch && isMatch(text.substring(1), pattern)));
        } else {
            // If no '*', proceed with the next characters
            return firstMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }
}
