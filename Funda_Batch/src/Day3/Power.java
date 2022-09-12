package Day3;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and exponent values:");
		
		int b=sc.nextInt();
		int e=sc.nextInt();
		int r=1;
		
		r=(int)Math.pow(b, e);
		
		System.out.println("Result");
	}

}
