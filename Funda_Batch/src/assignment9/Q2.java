package assignment9;

public class Q2 {

	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occurs");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception Occurs");
		}
		
		catch(NullPointerException  e)
		{
			System.out.println("NullPointer Exception Occurs");
		}
		System.out.println("Done");

	}

}
