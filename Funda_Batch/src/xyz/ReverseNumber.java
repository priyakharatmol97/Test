package xyz;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a num");
		int num=sc.nextInt();
		int result=0;
		
		while(num!=0)
		{
			int remainder=num%10;
			result=result*10+remainder;
			num=num/10;
		}
		System.out.println(result);

	}

}
