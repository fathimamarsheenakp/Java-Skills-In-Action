package practice.numbermanipulation;

public class SkipMultiplesOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 50) {
			i++;
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
