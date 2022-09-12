package exammaterial;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		
		int num=20;
		
		System.out.println("Fibonacci Series");
		int a=0,b=1;
		int c;
		for(int i=0;i<=num;i++)
		{
			c=a+b;
			System.out.println("The Fibonaci Series is:"+c);
			a=b;
			b=c;		
		}
		/* 0+1=1, 1+1=2, 2+1=3...
		 * 
		 */
		
	}

}
