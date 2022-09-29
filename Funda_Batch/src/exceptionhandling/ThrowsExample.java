package exceptionhandling;

public class ThrowsExample 
{
	int getStringLength(String s) throws NullPointerException
	{
		if(s==null)
		{
			throw new NullPointerException("Entered a null String");
		}
		return s.length();
	}

	public static void main(String[] args)// throws NullPointerException
	{
		ThrowsExample t=new ThrowsExample();
		
		System.out.println(t.getStringLength("Navi Mumbai"));
		try
		{
		System.out.println(t.getStringLength(null));
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		//System.out.println(t.getStringLength(null));
		System.out.println(t.getStringLength("Pune"));
		System.out.println(t.getStringLength("Maharshtra"));

	}

}
