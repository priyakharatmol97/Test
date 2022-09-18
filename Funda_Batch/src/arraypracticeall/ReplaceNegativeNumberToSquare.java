package arraypracticeall;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceNegativeNumberToSquare 
{
	void replace(int arr[],int size)
	{
		//int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]<=0)
			{
				arr[i]=arr[i-1]*arr[i-1];
			}
		}
		System.out.println(Arrays.toString(arr));
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
		
		ReplaceNegativeNumberToSquare r=new ReplaceNegativeNumberToSquare();
		r.replace(arr, size);

	}

}
