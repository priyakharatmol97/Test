package practiceall;

import java.util.Scanner;

public class EvenOdd
{
	void mod(int num)
	{
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		EvenOdd e=new EvenOdd();
		e.mod(num);

	}

}
