import java.util.Arrays;

public class Array_BothArrayEqualOrNot {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4};
		
		boolean status = Arrays.equals(a,b);
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		//Method 2
		boolean status1 = true;
		if(a.length == b.length)
		{
			//Compare rest of elements
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i] != b[i])
				{
					status = false;
				}
			}
		}
		else
		{
			status = false;
		}
		if(status == true) 
		{
			System.out.println("Arrays are equal!");
		}
		else 
		{
			System.out.println("Arrays are not equal!");
		}
	}
}