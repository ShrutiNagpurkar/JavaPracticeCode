import java.util.Scanner;

public class ReverseNumber_StringBufferType {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = s.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println("Reverse Number: "+ rev);
		

	}

}
