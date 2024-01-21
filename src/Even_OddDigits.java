import java.util.Scanner;

public class Even_OddDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		int even_count = 0;
		int odd_count = 0;
		
		while(num>0)
		{
			int rem = num%10;
			if(rem%2 == 0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num = num/10;
		}
		System.out.println("Even count : "+ even_count + " Odd count : "+ odd_count);
	}
}
