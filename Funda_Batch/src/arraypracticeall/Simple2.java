package arraypracticeall;

import java.util.Scanner;

public class Simple2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Display the array elements");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
