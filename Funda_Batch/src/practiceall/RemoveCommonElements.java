package practiceall;

import java.util.Scanner;

public class RemoveCommonElements 
{
	void common(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
					
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array is:");
		int size=sc.nextInt();
		int arr1[]= new int[size];
		
		System.out.print("Enter the first elements of Array");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		
		int arr2[]= new int[size];
		System.out.println("Enter the second elements of Array");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		RemoveCommonElements r=new RemoveCommonElements();
		r.common(arr1, arr2);

	}

}
