package arraypracticeall;

import java.util.Scanner;

public class EvenNumber
{
	void even(int arr[],int size)
	{
		System.out.println("Display the Even Number");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" ");
			}
		}
	}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("ENter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		EvenNumber e=new EvenNumber();
		e.even(arr, size);

	}

}
