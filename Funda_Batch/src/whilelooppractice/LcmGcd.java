package whilelooppractice;

import java.util.Scanner;

public class LcmGcd {

	public static void main(String[] args)
	{
		int a,b,temp,gcd,lcm;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter num1");
		int x=sc.nextInt();
		
		System.out.println("Enter num2");
		int y=sc.nextInt();
		
		a=x;
		b=y;
		
		while(b!=0)
		{
			temp=b;
			b=a%b;
			a=temp;
		}
		
		gcd=a;
		lcm=(x*y)/gcd;
		
		System.out.println("Greatest Common divisor is"+x+" "+y+" "+gcd);
		System.out.println("Least Commom multiple is"+x+" "+y+" "+lcm);
		
		

	}

}
