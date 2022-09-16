package practiceall;

import java.util.Scanner;

public class SumOfThreeNumbers 
{
	void sum(int num1,int num2,int num3)
	{
		int sum=num1+num2+num3;
		System.out.println("The sum of three numbers are:"+sum);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter third number");
		int num3=sc.nextInt();
		
		SumOfThreeNumbers s=new SumOfThreeNumbers();
		s.sum(num1, num2, num3);

	}

}
