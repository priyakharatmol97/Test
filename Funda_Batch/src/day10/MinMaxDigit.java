package day10;

import java.util.Scanner;

public class MinMaxDigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int max=num%10;
		int min=num%10;
		
		while(num!=0)
		{
			int remainder=num%10;
			if(remainder<min)
			{
				min=remainder;
			}
			if(remainder>max)
			{
				max=remainder;
			}
			
			num=num/10;
			

			
		}
		System.out.println(max);
		System.out.println(min);
		
	}
	

}
