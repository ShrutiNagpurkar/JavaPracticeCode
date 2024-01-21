
public class Array_Even_OddFromArray {

	public static void main(String[] args) {
		int a[] = {10,56,89,2,4,4,1,5,3,6,3,6,8};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.println(a[i] +" Even Number");
			}
			else
			{
				System.out.println(a[i] +" Odd Number");
			}
		}
		
		//Enhance for loop
		for(int value:a)
		{
			if(value%2 == 0)
			{
				System.out.println("Enhanced "+ value +" Even Number");
			}
			else
			{
				System.out.println("Enhanced "+ value +" Odd Number");
			}
		}
	}
}