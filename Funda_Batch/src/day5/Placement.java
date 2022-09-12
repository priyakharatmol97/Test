package day5;

import java.util.Scanner;

public class Placement {

	public static void main(String[] args)
	{
		

		       int cse;

		       int ece;

		       int mech;

		       // Try-Catch block to sanitize non-integer input

		       try

		       {

		           // Initialize Scanner object

		           Scanner sc = new Scanner(System.in);

		           // Take user input

		           System.out.print("Enter the no. of students placed in CSE: ");

		           cse = sc.nextInt();

		           System.out.print("Enter the no. of students placed in ECE: ");

		           ece = sc.nextInt();

		           System.out.print("Enter the no. of students placed in MECH: ");

		           mech = sc.nextInt();

		           sc.close();

		       }

		       catch (Exception e)

		       {

		           System.out.println("Invalid Input. Please enter integers only.");

		           return;

		       }

		       

		       // If any integer is negative, print message and exit

		       if (cse < 0 || ece < 0 || mech < 0)

		       {

		           System.out.println("Invalid Input. Please only enter non-negative integers.");

		           return;

		       }

		       // If all values are equal, print message and exit

		       if (cse == ece && ece == mech)

		       {

		           System.out.println("None of the departments got the highest placement.");

		           return;

		       }

		       System.out.println("Highest Placement:");

		       

		       // First, check if any two values are equal and greater than the third

		       if (cse == ece && cse > mech)

		       {

		           System.out.println("CSE");

		           System.out.println("ECE");

		       }

		       else if (cse == mech && cse > ece)

		       {

		           System.out.println("CSE");

		           System.out.println("MECH");

		       }

		       else if (ece == mech && ece > cse)

		       {

		           System.out.println("ECE");

		           System.out.println("MECH");

		       }

		       // Now, if we reached here, all values are distinct

		       // Check if one value is greater than both

		       else if (cse > ece && cse > mech)

		       {

		           System.out.println("CSE");

		       }

		       else if (ece > mech)

		       {

		           System.out.println("ECE");

		       }

		       else

		       {

		           System.out.println("MECH");

		       }

		   }

		

	}


