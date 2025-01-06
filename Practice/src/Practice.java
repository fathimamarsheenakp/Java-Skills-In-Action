import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the circular queue");
		Operation op = new Operation(sc.nextInt());
		
		while (true) {
			System.out.println("Enter your choice: ");
			System.out.println(" 1. Insert \n 2. Delete \n 3. Display \n 4. Get peek element \n Any number to exit");
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1:
					System.out.println("Enter element to insert");
					op.enqueue(sc.nextInt());
					break;
				case 2:
					op.dequeue();
					break;
				case 3:
					op.display();
					break;
				case 4:
					op.peek();
					break;
				default:
					System.out.println("Thank You!");
					return;
			}
		}
	}
}

