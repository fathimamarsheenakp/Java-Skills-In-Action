// biggest 4 digit prime numbers
public class PrimeNumber {

	public static void main(String[] args) {
		printPrime(1000,9999);
		
	}
	
	static void printPrime(int start, int end) {
		int count = 0;
//		for (int i = end; i >= start; i--) 
		for (int i = end; ; i--){
			if(isPrime(i)) {
				System.out.println(i);
				count++;
			}
			if (count == 5) {
				break;
			}
		}
	}
	
	static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
