
public class Array_DuplicateElementsInArray {

	public static void main(String[] args) {
		String a[] = {"A","B","C","D","E","A"};
		
		boolean duplicate = false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicare Element found in Array");
					duplicate = true;
				}
			}
		}
		if(duplicate == false)
		{
			System.out.println("No duplicate");
		}

	}

}
