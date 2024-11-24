
public class break2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 6; i <= 10; i++) {
			System.out.println("Hello ");
			if (i == 6) {
				break;
			}
		}
		
		int j = 6;
		while (j <= 10) {
			System.out.println("Hy ");
			if ( j == 6) {
				break;
			}
			j++;
		}
		
		int k = 6;
		do {
			System.out.println("Hi ");
			k++;
			if ( k == 6) {
				break;
			}
		} while (k <= 10);

	}


}
