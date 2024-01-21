
public class CountCharachterOccurance {

	public static void main(String[] args) {
		String str = "Java progamming java concepts and java oops  ";
		int a=str.length();
		str =str.replace("a", "");
		int b=str.length();
		int count = a-b;
		System.out.println(count);

	}

}
