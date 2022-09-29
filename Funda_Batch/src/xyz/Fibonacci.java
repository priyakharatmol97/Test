package xyz;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args)
	{
		int b=0,c=1;
		System.out.println(b);
		System.out.println(c);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter num");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			int d=b+c;
			System.out.println(d);
			b=c;
			c=d;
		}

	}

}
