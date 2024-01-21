import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = s.nextInt();
		
		int rev = 0;
		 while(num!=0) //123 = num
		 {
			 rev = rev*10 + num%10;  //0*10 + 1234%10 = 4  , 4*10 +123%10 = 4312
			 num = num/10; // 1234/10 = 123          
		 }
		 System.out.println("Reverse a number: " + rev);

	}

}
