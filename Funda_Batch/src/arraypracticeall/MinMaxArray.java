package arraypracticeall;

import java.util.Scanner;

public class MinMaxArray 
{
	void min(int arr[],int size)
	{
		int min=1;
		for(int i=0;i<size;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimun array is:"+min);
	}
	
	
	void max(int arr[],int size)
	{
		int max=1;
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximun array is:"+max);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		MinMaxArray m=new MinMaxArray();
		m.min(arr, size);
		m.max(arr, size);
	}
		

}
