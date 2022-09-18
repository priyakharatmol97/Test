package arraypracticeall;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArray 
{
	void equal(int a[],int b[])
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
					System.out.println("not equal");
					break;
				}
			}
			if(count==a.length)
			{
				System.out.println("length equal");
			}
			else
			{
				System.out.println("Length diff");
			}
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*System.out.println("ENter the size of array");
		int size=sc.nextInt();*/
		
		int a[]=new int[5];
		int b[]=new int[6];
		
		System.out.println("Enter the 1 st elements");
		{
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
		}
		
		System.out.println("ENter the 2 nd elements");
		{
			for(int i=0;i<b.length;i++)
			{
				b[i]=sc.nextInt();
			}
			
			
		}
		EqualArray e=new EqualArray();
		e.equal(a, b);

	}

}
