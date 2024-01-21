
public class SwapWithoutThirdVariable_SingleLine {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println("Value is a = "+ a+ " "+"Value is b = " +b);
		
		b = a+b - (a=b);
		
		System.out.println("Value is a = "+ a+ " "+"Value is b = " +b);
	}

}
