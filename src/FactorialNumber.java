import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		long factorial=1;
		
		//acending
		for(int i=1; i<=num;i++)
		{
			factorial =factorial * i;	
		}
		System.out.println("Factorial of Number : "+ factorial);
		
		//decending
		for(int i=num; i>=1;i--)
		{
			factorial =factorial * i;
		}
		System.out.println("Factorial of Number : "+ factorial);
	}
}