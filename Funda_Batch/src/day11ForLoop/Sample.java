package day11ForLoop;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int limit=sc.nextInt();
		
		//for(int i=1;i<=limit;i++)
		
	/*	for(int i=1;i<=limit;i++)
		{
			if(i%2==0)
			System.out.print(i+" ");			
		}
		System.out.println("Done");

	}*/
		
		/*for(int i=limit;i>=1;i--)
		{
			if(i%2!=0)
				System.out.print(i+" ");
		}
			System.out.println();
		}*/

	
		int product=1;
		for(int i=1;i<=limit;i++)
		{
			if(i%2==0)
			{
				System.out.println("product is even :"+product);
			}
			else
			{
				System.out.println("product is odd:"+product);
			}
			
			product= product*i;
			
		}
		System.out.println("product:"+product);
		System.out.println("Done");
	}
}
	

