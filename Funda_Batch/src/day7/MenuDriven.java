package day7;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter your Choice...");
        int ch=sc.nextInt();
		int a,b;
		 
		
		switch(ch)
		{
		case 1: 
		System.out.println("Enter Two Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition is:"+(a+b));
		break;
		
		case 2: 
		System.out.println("Enter Two Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Substration is:"+(a-b));
		break;
		
		case 3:
		System.out.println("Enter Two Numbers");
	    a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Multiplication is:"+(a*b));
		break;
		
		
		case 4:  
		
		System.out.println("Please do not enter 0 and null values...");
		System.out.println("Enter Two Numbers");
	    a=sc.nextInt();
		b=sc.nextInt();
		//if(a!=0)
		if(a==0)
		
			System.out.println("Denominator is zero please valid number");
		    System.out.println("Enter the Denominator");
		    a=sc.nextInt();
		    b=sc.nextInt();
		    System.out.println("Division is:"+(a/b));
		   

		//System.out.println("Please do not enter 0 and null values...");
		break;
		
		default: System.out.println("Enter valid input");
		}
		
				

	}

}
