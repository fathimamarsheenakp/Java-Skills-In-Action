import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mark: ");
		int mark = sc.nextInt();
		int convertedMark = mark / 10;
//		System.out.println(convertedMark);
		switch (convertedMark) {
		case 10:
		case 9:
		case 8:
			System.out.println("Grade A");
			break;
		case 7:
		case 6:
			System.out.println("Grade B");
			break;
		case 5:
		case 4:
			System.out.println("Grade C");
			break;
		default:
			System.out.println("Grade D");
			break;
		}
		

	}

}
