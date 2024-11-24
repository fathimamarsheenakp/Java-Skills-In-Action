package pattern.letter;

public class M {
	public static void main(String[] args) {
		int size = 11;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j == 1 || j == size || (i == j && i < (size+1)/2) || (i <= (size+1)/2  && i + j == size+1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
