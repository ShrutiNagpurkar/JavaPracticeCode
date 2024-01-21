
public class Array_MaxAndMinElementsInArray {

	public static void main(String[] args) {
		int a[] = {100,200,500,900,400,300};
		int max = a[0];
		 
		 for(int i=1;i<a.length;i++)
		 {
			 if(a[i]>max)
			 {
				 max=a[i];
			 }
		 }
		 System.out.println("The max number is : "+max);

		 int b[] = {200,500,900,400,300,100};
		 int min = a[0];
		 for(int i=1;i<a.length;i++)
		 {
			 if(a[i]<min)
			 {
				 min=a[i];
			 }
		 }
		 System.out.println("The min number is : "+min);
	}

}
