package day8;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int result=1;
		
		while(num>0)
		{
			result=result*num;
			num--;
			
		}
		System.out.println("Factorial number is:"+result);		

	}

}