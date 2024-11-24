package pattern.letter;

public class O {
	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if(j == 1 || j == size || i == size || i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
