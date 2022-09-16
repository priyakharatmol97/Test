package practiceall;

import java.util.Arrays;

public class DuplicateNumberArray 
{
	static void removeDuplicateElemenets(int arr[],int n)
	{
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[j+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[n-1];
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) 
	{
		int a1[]= {1,2,3,4,5,6};
		int b1[]= {4,5,6,7,8,9};
		
		int len=a1.length+b1.length;
		
		int c1[]=new int[len];
		
		for(int i=0;i<a1.length;i++)
		{
			c1[i]=a1[i];
		}
		
		int a=a1.length;
		
		for(int i=0;i<b1.length;i++)
		{
			c1[a+i]=b1[i];
		}
		System.out.println(Arrays.toString(c1));
		Arrays.sort(c1);
		
		System.out.println(Arrays.toString(c1));

	}

}
