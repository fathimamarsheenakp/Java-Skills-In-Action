
public class MethodSecond {
	public static void main(String[] args) {
		//System.out.println("Result after return is: "+add(10,20));
		int answer = add(10,20);
		System.out.println("Result after return is: "+answer);
		sub();
		int mul = mul(10,2);
		System.out.println("Multiplication : " +mul);
		div();
		//double average = add(3,20)/2;
		double ans = add(3,20);
		double average = ans/2;
		System.out.println("Average : "+average);
		System.out.println(average);
		
		
	}
	
	public static int add(int a, int b)
	{
		int x = 100;
		int y = 200;
		System.out.println("Addition : "+(x + y));
		return a+b;
	}
	
	public static void sub() {
		int m = 200;
		int n = 100;
		System.out.println("Substraction : "+(m-n));
	}
	
	public static int mul(int p,int q) {
		return p*q;
	}
	public static void div() {
		int a = 10;
		int b = 5;
		int c = a/b;
		System.out.println("Division Result : "+ c);
	}

}
