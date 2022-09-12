package assignment1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		
		for(int i=1;i<=20;i++)
		{
			int Square=i*i;
			System.out.println("The square is:"+Square);
		}
		
	}

}
