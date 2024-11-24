
public class continue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<= 5; i++) {
			System.out.println("Hello");
			if (i == 2) {
				continue;
			}
			else {
				System.out.println("World");
				break;
			}
		}
		System.out.println("================================================== WHILE ==========================================");
		int j = 0;
		while (j < 5) {
			System.out.println("Hello");
			j++;
			if (j == 2) {
				continue;
			}
			else {
				System.out.println("World");
				break;
			}
		}
		
		System.out.println("================================================== DO WHILE ==========================================");
		int k = 0;
		do {
			System.out.println("Hello");
			k++;
			if (k == 2) {
				continue;
			}
			else {
				System.out.println("World");
				break;
			}
		} while (j < 5);

	}

}
