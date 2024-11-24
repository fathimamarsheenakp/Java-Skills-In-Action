
public class DemoMethod {

	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("Start");
		add();
		sub();
		System.out.println("End");
		System.out.println("=====================");
	}
	public static void add()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Result of Addition : " + c);
	}
	
	public static void sub()
	{
		int a = 10;
		int b = 20;
		int c = a - b;
		System.out.println("Result of Subtraction : " + c);
	}


}
