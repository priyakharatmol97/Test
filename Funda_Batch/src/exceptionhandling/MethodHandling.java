package exceptionhandling;

public class MethodHandling 
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
	
	void multi(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiplication is:"+c);
	}
	
	void div(int a,int b)
	{
		try
		{
		int c=a/b;
		System.out.println("Division is:"+c);
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		int a=100,b=0;
		
		MethodHandling m=new MethodHandling();
		m.add(a, b);
		m.div(a, b);
		m.multi(a, b);

	}

}
