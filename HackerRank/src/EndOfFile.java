import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		System.out.println("Enter");
		Scanner scanner = new Scanner(System.in);
		int lineNumber = 1;
		while(scanner.hasNext()) {
			String line = scanner.nextLine();
			System.out.println(lineNumber + " " + line);
			lineNumber++;
		}
	}
	
}
