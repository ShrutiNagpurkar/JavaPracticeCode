
public class SwapWithoutThirdVariablePlus_MinusOperators {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		System.out.println("Value is a = "+ a+ " "+"Value is b = " +b);
		a = a + b; //2+3=5
		b = a - b; //5-3=2
		a = a - b; //5-2=3
		
		System.out.println("Value is a = "+ a+ " "+"Value is b = " +b);
	}

}
