import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		Integer a[] = {6,4,2,7,9,3};
		System.out.println("Array before sorting " + Arrays.toString(a)); //print whole array
		Arrays.parallelSort(a);
		//Arrays.sort(a); //both used for sorting
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array before sorting " + Arrays.toString(a));
	}
}