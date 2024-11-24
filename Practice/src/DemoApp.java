
public class DemoApp {

	public static void main(String[] args) {
		start();
		
		Demo demo = new Demo();
		demo.greet("Omkar");
		
		System.out.println("Right shift of 8 is " + Demo.rightShift(8));
//		System.out.println(demo.getRemainder(20,4));
		
		
		DemoApp app = new DemoApp();
		System.out.println("Calling getRemainder method in DemoApp");
		System.out.println(app.getRemainder(20,3));

	}
	
	public static void start() {
		System.out.println("Application started....");
	}
	
	public int getRemainder(int num1, int num2) {
		return num1 % num2;
	}
	
	

}
