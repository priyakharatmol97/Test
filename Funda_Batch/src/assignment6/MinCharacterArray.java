package assignment6;

import java.util.Arrays;

public class MinCharacterArray 
{
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
		System.out.println("Minimum character is:"+min);
		System.out.println();
	}
	
	
	void display(char arr[])
	{
		System.out.println("Array Of Elements:");
		System.out.println(Arrays.toString(arr));
	}


	public static void main(String[] args) 
	{
		char arr[] = {'A','D','E','x','z','R'};
		MinCharacterArray m=new MinCharacterArray();
		m.min(arr);
		m.display(arr);
		
	}

}

/*Output : 
Minimum character is:A
  
Array Of Elements:
[A, D, E, x, z, R]*/




