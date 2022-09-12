package day9;

import java.util.Scanner;

public class DoWhileLoop 
{

	public static void main(String[] args)
	{
		
		int num, mid,i=2;
		char ch;
		Scanner sc=new Scanner(System.in);
			
		do
		{
			System.out.println("Enter the number:");
			num=sc.nextInt();
			
			mid=num/2;
			
			while(i<=mid)
			{
				if(num%i==0)
				{
					break;
				}
				i++;	
			}
			if(i>mid)
			{
				System.out.println("Prime Number is:"+num);	
			}
			else
			{
				System.out.println("Not a prime number is:"+num);
							
			}
			System.out.println("Do You Want to Continue??(y/n)");
			ch=sc.next().charAt(0);
		
		} while(ch=='y'|| ch=='Y');
		
		
	}
}