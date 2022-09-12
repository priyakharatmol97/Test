package day11ForLoop;

import java.util.Scanner;

public class CubeForLoop {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println("Enter a power");
		int power=sc.nextInt();
		int product=1;
		
		for(int c=1;c<=power;c++)
		{
			product=product*num;
			
	}
		System.out.println("power of product is:"+product);

}
}
