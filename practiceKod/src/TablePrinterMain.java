import java.util.Scanner;

public class TablePrinterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		TablePrinter table = new TablePrinter();
		table.tablePrinter(number);
	}

}
