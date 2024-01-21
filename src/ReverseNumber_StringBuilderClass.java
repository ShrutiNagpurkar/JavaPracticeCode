import java.util.Scanner;

public class ReverseNumber_StringBuilderClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = s.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		
		StringBuilder rev =sb.reverse();
		
		System.out.println("Reverse Number: "+ rev);
	}
}
