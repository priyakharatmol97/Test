package practiceall;

import java.util.Scanner;

public class Swapping 
{
	void swap(int num1,int num2)
	{
		/*int num3=num1;
		num1=num2;
		num2=num3;
		
		System.out.println(num1+" "+num2);*/
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println(num1+" "+num2);
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		
		Swapping s=new Swapping();
		//s.swap(num1, num2);
		s.swap(num1, num2);

	}

}
