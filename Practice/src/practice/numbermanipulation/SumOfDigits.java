package practice.numbermanipulation;

public class SumOfDigits {
	public int sumOfDigits(int n) {
		int sum = 0;
		int i = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		return sum;
	}
}
