
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 11;
//		for (int i = 0; i <= n-1; i++) {
//			for (int j = 0; j <= (n-1)/2; j++) {
//				if (i == j || j == 0 || i+j == n-1) {
//					System.out.print("*");
//				}
//			else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		int m = 8;
		for (int i = 1; i <= m/2; i++) {
			for (int j = 1; j <= i; j++) {
				int b = 'A';
				System.out.print((char)(i + b - 1));
			}
			System.out.println();
		}
		
		for (int i = 1; i <= (m-1)/2; i++) {
			for (int j = (m-1)/2; j >= i; j--) {
				char a = 'C';
				System.out.print((char)(a - i + 1));
			}
			System.out.println();
		}
	}

}
