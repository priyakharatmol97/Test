package arraysingle;

import java.util.Scanner;

public class MultiplicationOdArray {

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
		int product=1;
		for(int i=0;i<size;i++)
		{
			product=product*arr[i];
				System.out.print(product+" ");
		}

	}

}
