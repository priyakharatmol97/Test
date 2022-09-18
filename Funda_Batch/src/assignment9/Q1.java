package assignment9;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		
		int arr[]= {1,2,3,4,56,10,45,67};
		String s=" ";
		
		//int a=100,b=0;
		
	
		try
		{
			char c=sc.nextLine().charAt(9);
			System.out.println("The character at index 9 is:"+c);
			//System.out.println("division is:"+a/b);	
		}
		
		catch(StringIndexOutOfBoundsException  e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		try
		{
			System.out.println("element at index:"+arr[9]);
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("Done");
		
		

	}

}



