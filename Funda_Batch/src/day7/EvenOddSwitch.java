package day7;

import java.util.Scanner;

public class EvenOddSwitch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values:");
		int num1=sc.nextInt();
	
		switch(num1%2)
		{
		case 0:
		    System.out.println(num1+" is an Even number");
		    break;
		    
		case 1:
		    System.out.println(num1+" is an Odd number");
		    break;
		    
	    default:System.out.println("Invalid");
		    
		    


	}
	}
}
