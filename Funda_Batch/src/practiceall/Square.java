package practiceall;

import java.util.Scanner;

public class Square 
{
	void squ(int a)
	{
		int square= a*a;
		System.out.println("The total Square of Area:"+square);
		
	}

	public static void main(String[] args) 
	{
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the area of square:");
         int a=sc.nextInt();
         
         Square s=new Square();
         s.squ(a);


	}

}
