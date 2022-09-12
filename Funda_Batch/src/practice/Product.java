package practice;

import java.util.Scanner;

public class Product {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number");
		int num=sc.nextInt();
		int product=0;
		
		
		for(int i=1;i<=num;i++)
		{
			product=(product*2)+1;
			System.out.print(product+" ");
		}
	}
}
