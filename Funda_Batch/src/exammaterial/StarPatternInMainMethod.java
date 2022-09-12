package exammaterial;

import java.util.Scanner;

public class StarPatternInMainMethod 
  {
	
	void starAccept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		StarPatternInMainMethod s=new StarPatternInMainMethod();
		s.starAccept();

	}

}
