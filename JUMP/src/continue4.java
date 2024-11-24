
public class continue4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			if (i == 1) {
				continue;
			} else if (i == 2) {
				System.out.println("How are you");
				continue;
			} else if (i == 3) {
				System.out.println("World");
				continue;
			} else {
				continue;
			}
		}
		
		System.out.println("============================================ WHILE =====================================");
		int j = 0; 
		while (j < 5) {
			System.out.println("Hello");
			j++;
			if (j == 1) {
				continue;
			} else if (j == 2) {
				System.out.println("How are you");
				continue;
			} else if (j == 3) {
				System.out.println("World");
				continue;
			} else {
				continue;
			}
		}
		
		System.out.println("============================================ DO WHILE =====================================");
		int k = 0; 
		do {
			System.out.println("Hello");
			k++;
			if (k == 1) {
				continue;
			} else if (k == 2) {
				System.out.println("How are you");
				continue;
			} else if (k == 3) {
				System.out.println("World");
				continue;
			} else {
				continue;
			}
		} while (k < 5);

	}

}
