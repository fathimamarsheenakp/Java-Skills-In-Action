
public class break3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 6; i <= 10; i++) {
			System.out.println("Hello ");
			if (i == 9) {
				break;
			}
		}
		
		int j = 6;
		while (j <= 10) {
			System.out.println("Hy ");
			j++;
			if ( j == 9) {
				break;
			}
//			j++;
		}
		
		int k = 6;
		do {
			System.out.println("Hi ");
//			k++;
			if ( k == 9) {
				break;
			}
			k++;
		} while (k <= 10);
	}

}
