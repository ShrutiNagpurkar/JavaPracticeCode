import java.util.HashSet;

public class Array_DuplicateElementsInArray_UsingHashSet {

	public static void main(String[] args) {

		String a[] = {"A","B","C","D","E","A"};
		boolean flag = false;
		HashSet <String>langs=new HashSet();
		/*System.out.println(langs.add("java"));
		System.out.println(langs.add("python"));
		System.out.println(langs.add("java")); */
		
		for(String l:a)
		{
			//System.out.println(langs.add(l));
			if(langs.add(l)==false)
			{
				System.out.println("Found Duplicate element : "+l);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("not found duplicate");
		}

	}

}
