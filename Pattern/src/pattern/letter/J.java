package pattern.letter;

public class J {

	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j == size || i == 1 || i == size || (j == 1 && i >= (size+1)/2) ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
