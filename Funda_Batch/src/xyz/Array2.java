package xyz;

import java.util.Scanner;

public class Array2 
{
	void even(int arr[],int size)
	{
		System.out.println("Even Number");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("ENter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Array2 a=new Array2();
		a.even(arr, size);

	}

}
