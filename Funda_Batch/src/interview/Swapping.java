package interview;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Before Swapping");
		System.out.println("Enter First Number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2=sc.nextInt();
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After Swapping");
		System.out.println(num1+" "+num2);
		
		
		
		

	}

}
