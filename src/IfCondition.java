import java.util.Scanner;

public class IfCondition {
	
	public static void main(String args[]) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age ");
		a = sc.nextInt();
		
		
		if( a > 50 ) {			
			
			System.out.println("You Have free gate pass ");
			
		}else if(a > 18) {
			
			System.out.println("You Have a gate pass ");
			
		}else {
		
			System.out.println("Wait for 18 ");
		}
		
	}
}
