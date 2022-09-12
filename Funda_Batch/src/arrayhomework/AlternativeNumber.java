package arrayhomework;

import java.util.Scanner;

public class AlternativeNumber 
{
	void alternative(int arr[],int size)
	{
		System.out.println(" ");
		for(int i=0;i<size;i=i+2)
		{
			
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array is:");
		int size=sc.nextInt();
		int arr[]= new int[size];
		
		
		System.out.println("Enter the elements of Array");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		
		AlternativeNumber a=new AlternativeNumber();
		a.alternative(arr, size);

	}

}
