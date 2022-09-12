package day8;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number to check Prime or Not");
		int num=sc.nextInt();
		int i=2;
		int mid=num/2;
	
		
		while(i<=mid)
		{
			if(num%i==0)
			{
				break;
			}
			i++;	
		}
		if(i>mid)
		{
			System.out.println("Prime Number is:"+num);	
		}
		else
		{
			System.out.println("Not a prime number is:"+num);
		}

	}

}
