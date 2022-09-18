package arraypracticeall;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray
{
	void reverse(int arr[],int size)
	{
		for(int i=0;i<size/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		ReverseArray r=new ReverseArray();
		r.reverse(arr, size);
		
		
		
		
	}

}
