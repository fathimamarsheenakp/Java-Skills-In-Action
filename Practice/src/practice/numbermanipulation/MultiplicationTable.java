package practice.numbermanipulation;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int product = i * j;
				System.out.print(product + "\t");
			}
			System.out.println();
		}

	}

}
