package assignment4;

public class Overload 
{
	void greater(int a,int b)
	{
		System.out.println(a>b);
	}
	
	void compare(String a,String b)
	{
		System.out.println(a.equals(b));
	}

	public static void main(String[] args)
	{
		Overload o=new Overload();
		o.greater(20, 10);
		o.compare("Priya", "Priya");
		System.out.println();
		
		o.greater(20, 10);
		o.compare("Priya", "Nayan");
		System.out.println();
		
		o.greater(10, 20);
		o.compare("Priya", "Priya");
		System.out.println();
		
		
		o.greater(10, 20);
		o.compare("Priya", "Nayan");

	}

}
