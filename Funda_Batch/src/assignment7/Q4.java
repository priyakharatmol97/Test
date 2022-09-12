package assignment7;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) 
	{
		int r=3,c=3;
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
		
		
		System.out.println("Before Transpose matrix ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("After Transpose matrix ");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println(" ");
		}
		
		
		

	}

}
