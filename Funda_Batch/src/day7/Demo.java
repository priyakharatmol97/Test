package day7;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		float b;
		
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		System.out.println("4. Square");
		
		
		System.out.println("Enter Your Choice...");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println("Enter the radius and pi values :");
		float r=sc.nextInt();
		float p=sc.nextInt();
		System.out.println("Area of Radius is:"+(p*r*r));
		break;
		
		case 2: System.out.println("Enter the length and breadth values:");
		float l=sc.nextInt();
	    b=sc.nextInt();
		System.out.println(" Area of Rectangle is:"+(l*b));
		break;
		
		case 3: System.out.println("Enter the base and height values:");
		b=sc.nextInt();
	    float h=sc.nextInt();
		System.out.println("Area of Triangle is:"+(0.5*b*h));
		break;
		
		case 4: System.out.println("Enter the square values:");
		float s=sc.nextInt();	
		System.out.println("Area of Square is:"+(s*s));
		break;
		
		default: System.out.println("Invalid Values...");
		
		}
	}

}
