
public class FactorialDoWhen {
	public int Factorial(int num) {
		int i = 1;
		int fact = 1;
		do {
			fact *= i;
			i++;
		} while (i <= num);
		return fact;
	}
}
