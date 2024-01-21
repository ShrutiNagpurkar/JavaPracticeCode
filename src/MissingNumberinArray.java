
public class MissingNumberinArray {

	public static void main(String[] args) {
		int a[] = {1,2,4,5};
		int sum=0;
		int missing_num;
		for(int i=0;i<a.length;i++)
		{
			sum = sum +a[i];
		}
		System.out.println(sum);
		int sum2 =0;
		for(int i=1;i<=a[3];i++)
		{
			sum2 = sum2+i;
		}
		System.out.println(sum2);
		System.out.println(missing_num = sum2 - sum);
	}
}