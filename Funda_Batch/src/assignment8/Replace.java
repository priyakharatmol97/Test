package assignment8;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args)
	{
		char r;
		String x;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Letter to Replace");
		r=sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter a String to replace letter");
		x=sc.nextLine();
		
		String ne=" ";
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)==r)
			{
				ne=ne+'*';
			}
				else
					ne=ne+x.charAt(i);
			}
		System.out.println("String After remove"+r+"is:"+ne);
		}

	}


