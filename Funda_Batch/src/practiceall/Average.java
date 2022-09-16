package practiceall;

import java.util.Scanner;

public class Average 
{
	void add(int num1,int num2,int num3,int num4,int num5)
	{
		int add=num1+num2+num3+num4+num5;
		System.out.println("The sum of five number is:"+add);
	
		int avg=add/5;
		System.out.println("The Average is"+avg);
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
		
		Average a=new Average();
		
		a.add(num1, num2, num3, num4, num5);
		
	}

}
