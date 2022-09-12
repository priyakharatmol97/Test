package Day4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		String operation;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		
		System.out.println("Enter the second number");
		num2=sc.nextInt();
		
		Scanner op=new Scanner(System.in);
		System.out.println("Please enter operation");
	    int ch=sc.next().charAt(0);
	    System.out.println(ch);
	    
		if(ch=='+')
		{
			System.out.println("addition is"+(num1+num2));
		}
		else if(ch=='-')
		{
			System.out.println("substraction is"+(num1-num2));
		}
		else if(ch=='/')
		{
			System.out.println("divide is"+(num1/num2));
		}
		else if(ch=='*')
		{
			System.out.println("multiply is"+(num1*num2));
		}
		else
		{
			System.out.println("Invalid Operation");
		}
		

	}

}
