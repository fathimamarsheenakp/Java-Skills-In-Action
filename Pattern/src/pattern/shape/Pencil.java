package pattern.shape;

public class Pencil {  
    public static void main(String[] args) {  
        // Define the number of rows for the pencil pattern
        int n = 5;  
          
        // Call method to print the pencil pattern
        printPencilPattern(n);  
    }  
      
    // Method to print the pencil pattern
    static void printPencilPattern(int n) {  
       for (int i = 1; i <= n; i++) {
        for (int j = n; j > i; j--) {
            System.out.print(" ");
        }
        for(int j = 1; j <= (2*i)-1; j++) {
            System.out.print("*");
        }
        System.out.println();
       }
        for(int i = 1; i <= n; i++) {
         for(int j = 1; j < 2 * n; j++) {
             if (j == 1 || j == 2*n - 1 || i == n) {
            	 System.out.print("*");
             } else {
            	 System.out.print(" ");
             }
         }
         System.out.println();
        }
    }  
}