package arrayhomework;

import java.util.Arrays;
import java.util.Scanner;

public class BothEqualOrNot 
{
	void equal(int a[],int b[],int size)
	{
		int count=0;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				{
					count++;
				}
				else
				{
					System.out.println("Elements are differenet not equal");
					break;
				}
			}
			if(count==a.length)
			{
				System.out.println("Length  equal");
			}
			
		}
		else
		{
			System.out.println("Length different not equal");
		}
		
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array is:");
		int size=sc.nextInt();
		int a[]= new int[size];
		
		System.out.println("Enter the elements of Array");
	
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
int b[]= new int[size];
		
		System.out.println("Enter the elements of Array");
	
		for(int i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
		}
		
		
		
		/*System.out.println("Enter the elements of Array");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}*/
		
		BothEqualOrNot be=new BothEqualOrNot();
		be.equal(a, b, size);
		
		
		

	}

}
