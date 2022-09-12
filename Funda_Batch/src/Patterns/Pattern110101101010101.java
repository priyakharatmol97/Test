package Patterns;

import java.util.Scanner;

public class Pattern110101101010101 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
					if(j%2==0)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
				}
			
			
			System.out.println();
		}

	
	}
}
