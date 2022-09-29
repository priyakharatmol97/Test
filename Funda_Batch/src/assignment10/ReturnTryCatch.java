package assignment10;

public class ReturnTryCatch 
{
	int method()
	{
		try
		{
			return 0;
		}
		
		finally
		{
			System.out.println("I am in finally block");
		}
		
	}

	public static void main(String[] args) 
	{
		ReturnTryCatch r=new ReturnTryCatch();
		r.method();

	}

}
