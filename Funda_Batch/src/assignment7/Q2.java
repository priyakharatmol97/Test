package assignment7;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args)
	{
		int r=2,c=2;
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[r][c];
		
		
		System.out.println("Enter array Elements ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}
		
		
		System.out.println("Enter array Elements in Matrix ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
		}
		
	
		
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					sum= sum+arr[i][j];
					
				}
		    
			}
	     }
		
System.out.println("Sum of Diagonal elements is:"+sum);

}

	
}

	