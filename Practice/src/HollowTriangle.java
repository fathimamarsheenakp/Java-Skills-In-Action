
public class HollowTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("-");
			}
			for (int j = n - 1; j >= i; j--) {
				if (j == n - 1 || i == 1 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
