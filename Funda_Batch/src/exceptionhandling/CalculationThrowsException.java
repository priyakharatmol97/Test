package exceptionhandling;

public class CalculationThrowsException 
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of two number is:"+c);
		multiply(a,b);
		System.out.println("Addition Done");
		System.out.println();
	}
	
	void multiply(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiplication  of two number is:"+c);
		division(a,b);
		/*try
		{
		division(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handle in multiply"+e);
			System.out.println("Multiplication Done");
			System.out.println();
		}*/
	}
	
	void division(int a,int b) throws ArithmeticException
	{
		int c=a/b;
		System.out.println("Division of two number is:"+c);
		System.out.println("Division Done");
		System.out.println();
	}

	public static void main(String[] args) 
	{
		CalculationThrowsException c=new CalculationThrowsException();
		c.add(10, 20);
		c.multiply(10, 20);
		c.division(10, 20);

	}

}
