package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceSquare 
{
	void replaceNegative(int[] arr, int size) 
	{
	
		for(int i=0;i<size;i++)
		{
			if(arr[i]<0)
			{
				arr[i] = arr[i-1]* arr[i-1];
			}
			
		}
		System.out.println(" ");
	}
	
	void display(int arr[],int size)
	{
		System.out.println("Array will be: ");
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
		
		ReplaceSquare r=new ReplaceSquare();
		r.replaceNegative(arr, size);
		r.display(arr, size);
		
	}
}
	
	
/* Output:
Enter the size of array is:
9
Enter the elements of Array
12
3
-19
29
5
-61
44
7
-9
 
Array will be: 
[12, 3, 9, 29, 5, 25, 44, 7, 49]
*/

	


