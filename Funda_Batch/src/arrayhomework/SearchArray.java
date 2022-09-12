package arrayhomework;

import java.util.Arrays;
import java.util.Scanner;

public class SearchArray 
{
	void search(int arr[],int search)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Searching The Elements:"+arr[i]);
				System.out.println("Found Index:"+i);
			}
		    
		} 
	}
	
		
	
	void display(int arr[])
	{
		System.out.println("Array Of Elements:");
		System.out.println(Arrays.toString(arr));
	}
	

	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,2};
		SearchArray s= new SearchArray();
		int search = 2;
		s.search(arr, search);
		s.display(arr);
		
		
	}



}
