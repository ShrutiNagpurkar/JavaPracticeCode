
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "string printed for test purpose";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
	}
}