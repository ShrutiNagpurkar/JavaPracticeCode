
public class LinearSearch_Array_SearchElement {

	public static void main(String[] args) {
		int a[] = {10,3,67,89,2,12,45,67};
		int num = 50;
		boolean flag = false;
		
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.println("Element found at "+ i);
				flag = true;
				break;
			}
		}
		
		if(flag == false)
		{
			System.out.println("Element not found");
		}
	}

}
