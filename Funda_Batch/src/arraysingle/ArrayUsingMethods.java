package arraysingle;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUsingMethods 
{
	void sumOfArray(int arr[],int size)
	{
		System.out.println("Elements of Sum of Array are");
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
				System.out.print(sum+" ");
				System.out.print(" ");
		}

	}
	
	
	void reverseArray(int arr[],int size)
	{
		System.out.println("Elements of Reverse Array are");
		for(int i=size-1;i>=0;i--)
		{
				System.out.print(arr[i]+" ");
				System.out.print(" ");
		}

	}
	
	
	void display(int arr[],int size)
	{
		System.out.println("Size of Array is: ");
		for(int a: arr)
		{
			
			System.out.println(a+" ");
			
		}
		//System.out.println(Arrays.toString(arr));
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array is:");
		int size=sc.nextInt();
		int arr[]= new int[size];
	
		
		System.out.println("Enter the elements of Array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		ArrayUsingMethods a=new ArrayUsingMethods();
		a.sumOfArray(arr, size);
		a.reverseArray(arr, size);
		a.display(arr, size);
	}

}
