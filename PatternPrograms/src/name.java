public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 11;
		letterF(row);
		letterA(row);
		letterT(row);
		letterH(row);
		letterI(row);
		letterM(row);
		letterA(row);
		System.out.println();
		letterM(row);
		letterA(row);
		letterR(row);
		letterS(row);
		letterH(row);
		letterE(row);
		letterE(row);
		letterN(row);
		letterA(row);

	}
	public static void letterF(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == (n/2)) {
					System.out.print(".");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void letterA(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1 ; j <= n; j++) {
				if (j == 1 || i == 1 || j == n || i == n/2) {
					System.out.print(".");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void letterT(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1 ; j <= n; j++) {
				if (i == 1 || j == n/2) {
					System.out.print(".");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void letterH(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1 ; j <= n; j++) {
				if (j == 1 || j == n || i == n/2) {
					System.out.print(".");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void letterI(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1 ; j <= n; j++) {
				if (i == 1 || j == n/2 || i == n) {
					System.out.print(".");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void letterM(int n) {
		for (int i = 1; i <= n; i++) {
            // Left vertical line of M
            System.out.print(".");

            // Diagonal lines of M
            for (int j = 1; j <= n; j++) {
                if (i == j && i <= n / 2) {  // Upper left diagonal
                    System.out.print(".");
                } else if (i + j == n + 1 && i <= n / 2) {  // Upper right diagonal
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }

            // Right vertical line of M
            System.out.print(".");

            System.out.println();
        }
		System.out.println();
	}
	
	public static void letterR(int n) {
        for (int i = 1; i <= n; i++) {
            // Left vertical line of R
            System.out.print(".");

            // Horizontal and diagonal lines of R
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == n / 2 + 1) && j < n - 1) { // Top and middle horizontal lines
                    System.out.print(".");
                } else if (j == n - 1 && i != 1 && i <= n / 2 + 1) { // Right vertical line (for top half)
                    System.out.print(".");
                } else if (i - j == n / 2 - 1 && i > n / 2) { // Diagonal line for the bottom part of R
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();
	}
	
	public static void letterS(int n) {
		for (int i = 1; i <= n; i++) {
	        for (int j = 1; j <= n; j++) {
	            if (i == 1 || i == n || i == n / 2 + 1) { // Top, middle, and bottom horizontal lines
	                System.out.print(".");
	            } else if (i < n / 2 + 1 && j == 1) { // Left vertical line for the top half
	                System.out.print(".");
	            } else if (i > n / 2 + 1 && j == n) { // Right vertical line for the bottom half
	                System.out.print(".");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	    System.out.println();
	}
	
	public static void letterE(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1 ; j <= n; j++) {
				if (i == 1 || i == n/2 || i == n || j == 1) {
					System.out.print(".");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void letterN(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1 ; j <= n; j++) {
				if (j == 1 || i == j || j == n) {
					System.out.print(".");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}
}
