
public class Array_SumOfElementsInArray {

	public static void main(String[] args) {
		int a[] =  {2,3,5,6,2,1};
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		//Enhance for loop
		
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println(sum);	
	}
}