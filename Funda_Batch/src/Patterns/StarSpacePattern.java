package Patterns;

import java.util.Scanner;

public class StarSpacePattern {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=r-1;i>=1;i--)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		}

	}


