package exceptionhandling;

public class Example {

	public static void main(String[] args) 
	{
		int a=10,b=0,c=20;
		
		c=a+b;
		System.out.println("Addition is:"+c);
		
		c=a*b;
		System.out.println("Multiplication is:"+c);

		
		try
		{
			c=a/b;
			System.out.println("Division is:"+c);
		}
		
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		
		
	}
	

}
