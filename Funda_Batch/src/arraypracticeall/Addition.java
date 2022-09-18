package arraypracticeall;

import java.util.Scanner;

public class Addition 
{
	void add(int arr[],int size)
	{
		System.out.println("Sum of total number is:");
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
			System.out.println(sum+" ");
		}
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
       
		
		Addition a=new Addition();
		a.add(arr, size);
				

	}

}
