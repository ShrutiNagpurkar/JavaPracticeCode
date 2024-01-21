

public class StudentsDetails {
	int sub1, sub2, sub3;
	String name;
	double percentage;
	int add;
	
	public void set_name(String name)
	{
		this.name=name;
	}
	
	public String get_name(String name)
	{
		return name;
	}
	public void set_sub(int sub1,int sub2,int sub3)
	{
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	
	public int get_sub1(int sub1)
	{
		return sub1;
	}
	
	public int get_sub2(int sub2)
	{
		return sub2;
	}
	
	public int get_sub3(int sub3)
	{
		return sub3;
	}
	
	public double Cal_Percentage(int sub1, int sub2, int sub3)
	{
		return percentage = ((sub1 + sub2+ sub3)/300)*100;
	}
	
	public void display_Results()
	{
		System.out.println( percentage);
	}
	
	public void display_statusWithGrade()
	{
		if(percentage >=35)
		{
			System.out.println("Grade = A" + " Pass");
		}
		else
		{
			System.out.println("Grade = F " + "Fail");
		}
	}
	
	public static void main(String[] args) {
		String St_name[] = {"A","B","C","D","E"};
		
		StudentsDetails s = new StudentsDetails();
		s.get_name("A");
		//s.get_sub( 56, 34, 45);
		s.Cal_Percentage(56,78,89);
		s.display_Results();
		s.display_statusWithGrade();
		System.out.println(s.get_name("A ")+ s.Cal_Percentage(56,78,89));
	}
}