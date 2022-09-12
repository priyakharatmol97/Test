package day5;

import java.util.Scanner;

public class Income {

	public static void main(String[] args) 
	{
		 System.out.print("Enter number of hours worked: ");

	       Scanner in = new Scanner(System.in);

	       double totalHoursWorked = in.nextInt();

	       double standardWage = 37.50;

	       int standardHours = 40;

	       double totalWage;

	       double overtimeBonus = 2.50;

	       if (totalHoursWorked > 40)

	           totalWage = (standardWage * totalHoursWorked)

	                       + (totalHoursWorked - standardHours) * overtimeBonus;

	       else if (totalHoursWorked < 40)

	           totalWage = standardWage * totalHoursWorked;

	       else

	           totalWage = standardWage * standardHours;

	       System.out.println("Your total salary of the week is: " + totalWage);
	    }
	


	}


