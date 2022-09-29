package assignment10;

public class ThrowsExcep 
{
	static void check() throws ArithmeticException
	{
		System.out.println("Inside check method");
		throw new ArithmeticException("Example");
	}

	public static void main(String[] args) 
	{
		try
		{ 
			//int c=10/0;
			check();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch:"+e);
		}
		

	}

}
