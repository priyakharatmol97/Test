package whilelooppractice;

import java.util.Scanner;

public class PrimeNumber400To300 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any num");
		int num=sc.nextInt();
		int i=400;
		int count=0;
		while(i>=1)
		{
			i=i-1;
		}
			
		

		if(i==0)
			System.out.println(i+"is a prime number");
		else
			System.out.println(i+"is a not prime number");

	}
	
		

}
