
public class ReverseString_StringBufferClass {

	public static void main(String[] args) {
		String str = "ABCD";
		String rev = "";
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}