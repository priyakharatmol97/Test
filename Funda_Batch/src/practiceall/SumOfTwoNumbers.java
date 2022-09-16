package practiceall;

import java.util.Scanner;

public class SumOfTwoNumbers
{
	void sum(int num1,int num2)
	{
		int sum=num1+num2;
		System.out.println("Sum of Two Number is:"+sum);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		
		SumOfTwoNumbers s=new SumOfTwoNumbers();
		s.sum(num1, num2);

	}

}
