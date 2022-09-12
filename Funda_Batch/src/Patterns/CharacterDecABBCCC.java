package Patterns;

import java.util.Scanner;

public class CharacterDecABBCCC {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int r=sc.nextInt();
			
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
        }
		
		
		
		for(int i=1;i<=r;i++)
		{
			for(int j=i;j<=r-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(i+64));
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
		
		
		
		for(int i=r-1;i>=1;i--)
		{
			for(int j=1;j<=r-i;j++)
			{
			System.out.print(" ");
		}
	     for(int j=1;j<=i;j++)
	     {
		System.out.print((char)(i+64));
	     }
	     for(int j=i-1;j>=1;j--)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
	
}
