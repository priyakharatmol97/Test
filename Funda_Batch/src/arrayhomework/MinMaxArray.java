package arrayhomework;

import java.util.Arrays;

public class MinMaxArray 
{
	void max(int arr[])
	{
		int max=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Display Maximun Numbers:"+max);
		System.out.println();
	}
	
	void min(int arr[])
	{
		int min=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Display Minimum Numbers:"+min);
		System.out.println();
	}
	
	void display(int arr[])
	{
		System.out.println("Array Of Elements:");
		System.out.println(Arrays.toString(arr));
	}


	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7,8};
		MinMaxArray m=new MinMaxArray();
		m.max(arr);
		m.min(arr);
		m.display(arr);

	}

}
