
package classandobjects;

import java.util.Scanner;

public class FactorialUingScanner  

{

	void factorial(int a) 
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:"+fact);
	}
	
	void power(int power,int num)
	{
		int product=1;
		for(int i=1;i<=power;i++)
		{
			product=product*num;
		}
		System.out.println("Power is:"+product);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		Factorial f=new Factorial();
		f.factorial(n);
		
		System.out.println("ENter a number to find the power");
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println("Enter a power:");
		int p=sc.nextInt();
		
		f.power(num,p);
		
		
		
		
		
	}

}

	
	
	
	
	

	