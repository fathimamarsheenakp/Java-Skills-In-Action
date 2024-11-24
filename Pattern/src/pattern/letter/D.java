package pattern.letter;

public class D {
	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j == 1 || i == 1 || j == size || i == size) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
