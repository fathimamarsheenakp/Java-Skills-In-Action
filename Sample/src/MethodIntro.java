
public class MethodIntro {

	public static void main(String[] args) {
		
		add();
		int a = 20;
		int b = 5;
		sub(a,b);
		
		System.out.println("Multiplication : "+mul());
		
		int x = 20;
		int y = 4;
		double divres = div(x,y);
		System.out.println("Division : "+divres);

	}
	public static void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Addition : "+c);
	}
	
	public static void sub(int num1, int num2) {
		int answer = num1 - num2;
		System.out.println("Subtraction : "+answer);
	}
	public static int mul() {
		int a = 10;
		int b = 20;
		int c = a * b;
		return c;
	}
	
	public static double div(int numerator, int denominator) {
		double quotient = numerator / denominator;
		return quotient;
		
	}

}
