import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {6,4,2,7,9,3};
		System.out.println("Array before sorting " + Arrays.toString(a)); //print whole array
		int n=a.length; //6
		
		for(int i=0;i<n;i++) //Number of passes
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("Array after sorting " + Arrays.toString(a));
	}
}