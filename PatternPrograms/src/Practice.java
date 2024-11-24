public class Practice {
    public static void main(String[] args) {
        int n = 5;  // Number of rows for the pattern

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                // Determine the positions to print an asterisk
                if (j == n - i - 1 || j == n + i - 1 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
