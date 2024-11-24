
public class break4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 6; i <= 10; i++) {
			System.out.println("Hello ");
			if (i == 6 && i == 7) {
				break;
			}
		}
		int j = 6;
		while (j <= 10) {
			System.out.println("Hy ");
			j++;
			if ( j == 6 && j == 9) {
				break;
			}
//			j++;
		}
		
		int k = 6;
		do {
			System.out.println("Hi ");
			k++;
			if ( k == 9 && k == 6) {
				break;
			}
//			k++;
		} while (k <= 10);
	}

}
