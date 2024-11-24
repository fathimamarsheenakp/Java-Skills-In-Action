
public class CheckPrimeInRange {
	boolean isPrime(int n) {
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
	
	void printPrime(int start, int end) {
		for (int i = start; i <= end; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
