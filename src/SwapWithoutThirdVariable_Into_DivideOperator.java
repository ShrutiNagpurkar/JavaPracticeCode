
public class SwapWithoutThirdVariable_Into_DivideOperator {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println("Value is a = "+ a+ " "+"Value is b = " +b);
		//a and b should not be 0
		
		b = b*a; // 3*2 = 6
		a = b/a; // 6/2 = 3
		b = b/a; // 6/3 = 2
		System.out.println("Value is a = "+ a+ " "+"Value is b = " +b);
	}

}
