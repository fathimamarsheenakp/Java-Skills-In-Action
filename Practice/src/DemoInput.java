import java.util.Scanner;

public class DemoInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Enter your name: ");
//		String name = scan.nextLine();
	
		System.out.println("Enter your Father's name: ");
		String father = scan.nextLine();
		
//		System.out.println("Enter your age: ");
//		int age = scan.nextInt();
		
		System.out.println("Enter height: ");
		float height = scan.nextFloat();
		
		System.out.println("Enter true if married else false: ");
		boolean married = scan.nextBoolean();
		
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		
		System.out.println("Enter your Mother's name: ");
		String mother = scan.next();
		
		System.out.println("Enter your name: ");
		scan.nextLine(); //can't use next() 
		String name = scan.nextLine();
		
		//if using nextLine() under the boolean use scan.nextLine() twice
		
		System.out.println("Name is "+name);
		System.out.println("Father is "+father);
		System.out.println("Mother is "+mother);
		System.out.println("Age is "+age);
		System.out.println("Height is "+height);
		System.out.println("Married : "+married);
		}

}
