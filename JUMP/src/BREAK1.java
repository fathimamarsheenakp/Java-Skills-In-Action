
public class BREAK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 6; i <= 10; i++) {
			System.out.println("Hello ");
			break;
		}
		int j = 6;
		while (j <= 10) {
			System.out.println("Hy ");
			j++;
			break;
//			j++ will make an error
		}
		
		int k = 6;
		do {
			System.out.println("Hi ");
			k++;
			break;
		} while (k <= 10);

	}

}
