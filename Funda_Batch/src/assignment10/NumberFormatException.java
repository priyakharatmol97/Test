package assignment10;

import java.util.Scanner;

public class NumberFormatException 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("ENter Age");
		//int age=sc.nextInt();
		int age;
		
		try
		{
			System.out.println("Please Enter Age");
			age=Integer.parseInt(sc.next());
			System.out.println("Your age is:"+age);
		}
		catch(Exception e)
		{
			System.out.println("The NumberFormatException");
			System.out.println("Please enter valid age");
		}

	}

}
