package Inheritance;

public class C extends B
{
	/*C()
	{
		System.out.println("Inside class A");
	}*/
	
	C(int a)
	{
		super(1000);
		System.out.println("Inside class A of Parameterized Method"+" "+a);
	}


}
