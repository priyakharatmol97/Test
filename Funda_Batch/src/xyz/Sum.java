package xyz;

import java.util.Scanner;

public class Sum 
{
	void sum(int arr[],int size)
	{
		System.out.println("Array elements");
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
			System.out.println(sum);
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
		
		Sum s=new Sum();
		s.sum(arr, size);

	}

}
