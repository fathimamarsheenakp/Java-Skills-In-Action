
public class Program42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 1 || i == 5 || j == 1 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
