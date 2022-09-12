package arraysingle;

import java.util.Arrays;
import java.util.Scanner;

public class CountNegativeInArray 
{
	
	void rearrange(int[] arr, int size) 
	{
	
		for(int i=0;i<size;i++)
		{
			if(arr[i]<0)
			{
				arr[i] = arr[i-1]* arr[i-1];
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	void display(int arr[],int size)
	{
		System.out.println("Size of Array is: ");
		/*for(int a: arr)
		{
			
			System.out.println(a+" ");
			
		}*/
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
		
		
		CountNegativeInArray c=new CountNegativeInArray();
		c.rearrange(arr, size);
		c.display(arr, size);
	}

	
}
