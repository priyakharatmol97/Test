package assignment9;

public class Q3 
{
	int cal()
	{
		try
		{
			int x=12/0;
		}
		catch(Exception e)
		{
			return 10;
		}
		finally
		{
			return 20;
		}
	}

	public static void main(String[] args) 
	{
		Q3 q=new Q3();
		System.out.println(q.cal());
		

	}

}
