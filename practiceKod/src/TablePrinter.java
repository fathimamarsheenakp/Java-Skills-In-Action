
public class TablePrinter {
	public void tablePrinter(int num) {
		int multiplier = 1;
		do {
			System.out.println(num + " * " + multiplier + " = " + (num * multiplier));
			multiplier++;
		} while (multiplier <= 10);
	}
}
