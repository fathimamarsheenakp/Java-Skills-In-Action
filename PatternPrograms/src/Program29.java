
public class Program29 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            // Loop to print spaces before stars
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            // Loop to print stars and spaces in between
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == 5) {
                    System.out.print("*");  // Print * at the edges or bottom row
                } else {
                    System.out.print(" ");  // Print space inside the hollow triangle
                }
            }
            System.out.println();  // Move to the next row
        }
    }
}

