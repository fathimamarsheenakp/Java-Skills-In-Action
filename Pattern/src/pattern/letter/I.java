package pattern.letter;

public class I {

	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j == (size+1)/2 || i == 1 || i == size) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
