
public class ReverseEachWordInAString_StringBuilderClasss {

	public static void main(String[] args) {
		String str = " Welcome to Java";
		String word[] = str.split("\\s"); //split string into multiple words
		String reverseWord = "";
		
		for(String w:word)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			reverseWord = reverseWord + sb.toString()+ " ";
		}
		System.out.println("The reverse Sting : "+ reverseWord);
	}
}