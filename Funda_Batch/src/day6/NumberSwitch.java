package day6;

import java.util.Scanner;

public class NumberSwitch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month number:");
		int ch=sc.nextInt();
		
		System.out.println("Enter a year:");
		int year=sc.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println("31 days");
		break;
		
		
		case 2: //System.out.println("28 days");
		
		if(year%4==0) 
		{
			System.out.println("This year is leap year");
		}
		else
		{
			System.out.println("This year is not a leap year");
			
			
		}
		break;
		
		case 3: System.out.println("31 days");
		break;
		
		case 4: System.out.println("30 days");
		break;
		
		case 5: System.out.println("31 days");
		break;
		
		case 6: System.out.println("30 days");
		break;
		
		case 7: System.out.println("31 days");
		break;
		
		case 8: System.out.println("31 days");
		break;
		
		case 9: System.out.println("30 days");
		break;
		
		case 10: System.out.println("31 days");
		break;
		
		case 11: System.out.println("30 days");
		break;
		
		case 12: System.out.println("31 days");
		break;
		
		
		default:System.out.println("please enter valid number");
		}

	}

	}

