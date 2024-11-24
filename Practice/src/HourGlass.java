public class HourGlass {

    public static void main(String[] args) {
        int n = 9;  // Number of rows for the top half of the hourglass

        // Top half of the hourglass
        for (int i = 0; i < n / 2 + 1; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half of the hourglass
        for (int i = n / 2 - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
