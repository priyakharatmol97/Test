package arraysingle;

import java.util.Arrays;
import java.util.Scanner;

public class CN 
{
	void count(int arr[])
	{
		int count=0;
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=0)
			{
				count++;
			}
		}
		System.out.println("Count all negative numbers:"+count);
	}
	
	void display(int arr[])
	{
		//System.out.println("Size of Array is: ");
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args)
	{
		int[] arr= {8,-10,54,-6,4,-37,2,-4};
		System.out.println("Length of array is:"+arr.length);
		CN c=new CN();
		c.count(arr);
		c.display(arr);

	}

}
