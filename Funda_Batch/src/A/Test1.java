package A;

public class Test1
{
	private int a=10; //private
	int b=20; //default
	protected int c=30;//protected
	public int d=40;//public
	
	public void display()
	{
		System.out.println("Inside method");
	}
	/*protected void display2()
	{
		System.out.println("Inside method");
	}*/


public static void main(String args[])
{
	Test1 t1=new Test1();
	System.out.println(t1.a);
	System.out.println(t1.b);
	System.out.println(t1.c);
	System.out.println(t1.d);
	t1.display();
	//t1.display2();
			
}
}