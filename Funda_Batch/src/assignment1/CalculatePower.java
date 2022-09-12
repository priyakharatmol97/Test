package assignment1;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and index values:");
		
		int b=20;
		int i=3;
		int r=1;
		
		while(i!=0)
		{
			r=r*b;
			i--;
			
		}
		
		System.out.println("Result is:"+r);

	}

}
