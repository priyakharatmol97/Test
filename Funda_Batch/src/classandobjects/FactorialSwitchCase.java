package classandobjects;

import java.util.Scanner;

public class FactorialSwitchCase 
{
	void factorial(int n) 
	{
		int fact=1;
		for(int i=1;i<=n;i++)
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
		Factorial f=new Factorial();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the choice:");
		/*System.out.println("1.factorial");
		System.out.println("2.power");*/
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println("Enter number:");
		        int n=sc.nextInt();
		        f.factorial(n);
		        break;
		        
		case 2:  System.out.println("Enter number to find the power:");
                  int num=sc.nextInt();
                  System.out.println("Enter power:");
                  int p=sc.nextInt();
                  f.power(num, p);
                  break;
           
         default:System.out.println("invalid");         
		}
	}
}
		
		
