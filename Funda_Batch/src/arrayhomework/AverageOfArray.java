package arrayhomework;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArray 
{
	void sumAverage(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int average=sum/arr.length;
		
		System.out.println("Total Sum Of Number is:"+sum);
		System.out.println();
		
		System.out.println("The Average of:"+average);
		System.out.println();
	}


	
	void display(int arr[])
	{
		System.out.println("Array Of Elements:");
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) 
	{
		//int arr[]= {1,2,3,4,5};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array is:");
		int size=sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("Enter the elements of Array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		AverageOfArray a=new AverageOfArray();
		a.sumAverage(arr);
		a.display(arr);

	}

}
