package com.kodnest.dsa.array;

public class MyProgram {
    public static void main(String[] args) {
        // Check if any arguments were passed
        if (args.length > 0) {
            // Loop through the arguments and print them
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments were passed.");
        }
        main();
        int[] arr = {10, 20, 30, 40, 50};
        main(arr);
        String[] array= {"Alia", "Bharat", "Kiara", "Charlie"};
        main(array, "Taimur");
        main(arr,"Karan");
        
        float[] ar = {1.5f, 2.5f, 2.6f, 2.3f};
        main(ar);
    }
    
    public static void main() {
    	System.out.println("Method-1");
    	System.out.println("Hey buddy....");
    	}
    
    public static void main(int[] arr) {
    	System.out.println("------------------------------------------------");
    	System.out.println("Method-2");
    	for (int x : arr) {
    		System.out.print(x + " ");
    	}
    	System.out.println();
    }
    
    public static void main(String[] array, String name) {
    	System.out.println("------------------------------------------------");
    	System.out.println("Method-3");
    	for (String x : array) {
    		System.out.print(x + " ");
    	}
    	System.out.println();
    	System.out.println(name);
    }
    
    public static void main(int[] array, String name) {
    	System.out.println("------------------------------------------------");
    	System.out.println("Method-4");
    	for (int x : array) {
    		System.out.print(x + " ");
    	}
    	System.out.println();
    	System.out.println(name);
    }
    
    public static void main(float[] arr) {
    	System.out.println("------------------------------------------------");
    	System.out.println("Method-5");
    	for (float x : arr) {
    		System.out.print(x + " ");
    	}
    }
    
}
