package pattern.letter;

public class K {

	public static void main(String[] args) {
		int size = 10;
		for (int i = 0; i <= size; i++) {
			for (int j = 0; j <= size; j++) {
				if (j == 0 || i + j == (size)/2 || i - j == (size)/2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
