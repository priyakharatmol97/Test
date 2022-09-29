package whilelooppractice;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a number:");
		//int number=sc.nextInt();
		
		int i=1;
		while(i<20)
		{
			System.out.println(i*i);
			i++;
		}
	}

}
