
public class Continue1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			if (i == 2) {
				continue;
			}
			System.out.println("World");
		}
		System.out.println("=============================== While ==============================");
		
		int j = 0; 
		while (j < 5) {
			System.out.println("Hello");
			j++;
			if (j == 2) {
				continue;
			}
			
			System.out.println("World");
//			j++;
		}
		
		System.out.println("================================ Do While ==============================");
		int k = 0; 
		do{
			System.out.println("Hello");
			k++;
			if (k == 2) {
				continue;
			}
			System.out.println("World");
		} while (k < 5);
	}
}
