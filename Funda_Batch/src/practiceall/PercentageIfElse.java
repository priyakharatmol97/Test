package practiceall;

import java.util.Scanner;

public class PercentageIfElse 
{
	void sumPercentage(int num1,int num2,int num3,int num4,int num5)
	{
		int sum=num1+num2+num3+num4+num5;
		System.out.println("Sum of five number is:"+sum);
		int per=sum/5;
		System.out.println("Percentage of five number is:"+per);
		
		if(per>=95)
		{
			System.out.println("A+");
		}
		else if(per>=85 && per<95)
		{
			System.out.println("A");
		}
		else if(per>=75 && per<85)
		{
			System.out.println("B");
		}
		else if(per>=65 && per<75)
		{
			System.out.println("C");
		}
		else if(per>=55 && per<65)
		{
			System.out.println("D");
		}
		else if(per>=45 && per<55)
		{
			System.out.println("E");
		}
		else if(per>=35 && per<45)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
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
		
		System.out.println("Enter fourth number");
		int num4=sc.nextInt();
		
		System.out.println("Enter fifth number");
		int num5=sc.nextInt();
		
		
		PercentageIfElse p=new PercentageIfElse();
		p.sumPercentage(num1, num2, num3, num4, num5);
		

	}

}
