import java.util.Scanner;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third number : ");
		int num3 = sc.nextInt();
		
		//Approach 1
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1 + " is largest number");
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println(num2 + " is largest number");
		}
		else
		{
			System.out.println(num3 + " is largest number");
		}
		
		//Approach 2 - ternary operator
		 int largest =  num1>num2?num1:num2; //largest of 1 and 2
		 largest = num3>largest?num3:largest;
		 System.out.println("largest number : "+largest);
	}
}