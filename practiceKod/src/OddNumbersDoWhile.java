
public class OddNumbersDoWhile {
	public void oddNumbers(int num) {
		int i = 1;
		do {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= num);
	}
}
