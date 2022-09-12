package arraysingle;

import java.util.Scanner;

public class AdditionOfArray {

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
		
		System.out.println("Elements of Array are");
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
				System.out.print(sum+" ");
		}

	}

}
