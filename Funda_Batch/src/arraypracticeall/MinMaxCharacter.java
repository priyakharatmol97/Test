package arraypracticeall;

import java.util.Scanner;

public class MinMaxCharacter
{
	void max(char arr[])
	{
		char max='a';
		for(char i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
	void min(char arr[])
	{
		char min='a';
		for(char i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) 
	{
		char arr[]= {'b','e','z','d','a'};
		
		
		MinMaxCharacter m=new MinMaxCharacter();
		m.min(arr);
		m.max(arr);
		

	}

}
