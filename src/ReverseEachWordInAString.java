
public class ReverseEachWordInAString {

	public static void main(String[] args) {
		//Method 1
		String str = " Welcome to Java";
		String word[] = str.split(" "); //split string into multiple words
		String reverseString ="";
		
		for(String w:word)
		{
			String reverseWord="";
			for(int i=w.length()-1;i>=0;i--) //Welcome
			{
				reverseWord = reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord + " "; //emocleW
		}
		System.out.println("The reverse string : "+reverseString);

	}

}
