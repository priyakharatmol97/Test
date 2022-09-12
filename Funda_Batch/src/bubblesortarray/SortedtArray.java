package bubblesortarray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedtArray
{
	void sorting(int arr[])
	{
		int len=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("The Second Highest Element is:"+arr[len-2]);
		System.out.println("Maximum Number of Second:"+arr[2]);
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
		
		
		SortedtArray s=new SortedtArray();
		s.sorting(arr);
		

	}

}
