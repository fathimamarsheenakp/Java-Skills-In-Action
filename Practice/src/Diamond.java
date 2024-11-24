
public class Diamond {
	public static void main(String[] args) {
		int row = 5;
		int col = 9;
		for (int i = row; i > 0; i--) {
			for (int j = col; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = 1; j <= i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
