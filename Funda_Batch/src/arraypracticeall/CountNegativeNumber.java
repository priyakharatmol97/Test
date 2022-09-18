package arraypracticeall;

import java.util.Arrays;
import java.util.Scanner;

public class CountNegativeNumber 
{
	void count(int arr[],int size)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]<=0)
			{
				count++;
			}
		}
		System.out.println("Count all negative number:"+count);
	}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		CountNegativeNumber c=new CountNegativeNumber();
		c.count(arr, size);
	}

}
