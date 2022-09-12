package Day3;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer number");
		num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println(num+"is POSITIVE NUMBER");
			
		}
		else if(num>0)
		{
			System.out.println(num+"is NEGATIVE NUMBER");
		}
		else
		{
			System.out.println("It's ZERO");
		}

	}

}
