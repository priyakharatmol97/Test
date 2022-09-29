package assignment10;

public class NullException 
{
	void oneScenario()
	{
		Object ref=null;
		ref.toString();	
	}
	void SecondScenario()
	{
		String ptr=null;
		try
		{
			if(ptr.equals("xyz"))
			{
				System.out.println("Same");
			}
			else
			{
				System.out.println("Not Same");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
				
	}
	void thirdScenario()
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
		
		
		catch(NullPointerException  e)
		{
			System.out.println("NullPointer Exception Occurs");
		}
		System.out.println("Done");

	}

	

	public static void main(String[] args)
	{
		NullException n=new NullException();
		n.oneScenario();
		n.SecondScenario();
		n.thirdScenario();
		

	}

}
