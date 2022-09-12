package exammaterial;

import java.util.Scanner;

public class FibonacciSeriesInUsingMethod 
{
	void fibonacci()
	{
		   int num=12;
		   
		   System.out.println("Fibonacci Series");
		   int a=0,b=1;
		   int c;
		   
		 for(int i=0;i<=num;i++)
		 {
			 c=a+b;
			 System.out.println("The Fibonacci Series is:"+c);
			 a=b;
			 b=c;
		 }		   
		   
	}

	public static void main(String[] args) 
	{
		FibonacciSeriesInUsingMethod f=new FibonacciSeriesInUsingMethod ();
		f.fibonacci();

	}

}
