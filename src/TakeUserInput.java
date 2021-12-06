import java.util.Scanner;

public class TakeUserInput {

	public static void main(String args[]) {
		
		int a,b, result;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter first number ");
		a = sc.nextInt();
		
		System.out.println("Enter second number ");
		b = sc.nextInt();
				
		result = a + b;
		
		System.out.println("SUM OF " + a + " & " + b + " IS " + result );
		
		
		
	}
	
}
