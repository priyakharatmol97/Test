package Day4;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Year:");
		int year=sc.nextInt();
		
		if(((year%4==0) &&(year%100!=0))||(year%400==0))
		{
			System.out.println("This year is leap year");
		}
		else
		{
			System.out.println("This year is not a leap year");
			
		}

	}

}
