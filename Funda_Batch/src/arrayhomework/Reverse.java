package arrayhomework;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse 
{
	void arrayReverse(int arr[],int size)
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
		System.out.println("Enter the size of array is:");
		int size=sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("Enter the elements of Array");
	
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		Reverse r=new Reverse();
	    r.arrayReverse(arr, size);
		
		
		
		

	}

}

