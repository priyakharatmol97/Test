
package exceptionhandling;

import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int c1=sc.nextInt();
		
		Calculator c=null;
		
		int arr[]= {1,2,3,4,56,10,45,67};
		String s=null;
		
		int a=100,b=2;
		try
		{
			System.out.println("division is:"+a/b);
			System.out.println("element at index:"+arr[10]);
			//c.toString();
		}
		//catch(ArithmeticException e)
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}*/
		//System.out.println("Done");


		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		/*finally
		{
			System.out.println("Finally block is executed irrespective of any exception");
			System.out.println("Done");
			sc.close();
		}*/
		
		}
}


