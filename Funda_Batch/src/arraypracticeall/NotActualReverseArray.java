package arraypracticeall;

import java.util.Scanner;

public class NotActualReverseArray 
{
	void reverse(int arr[],int size)
	{
		System.out.println("Display Not Actual reverse Number");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		NotActualReverseArray n=new NotActualReverseArray();
		n.reverse(arr, size);

	}

}
