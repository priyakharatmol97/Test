package day7;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int n;

		System.out.println("Enter the number between 1-7");

		n = sc.nextInt();

		switch(n)

		{

		case 1: System.out.println("Day corresponding to 1 is Sunday");

		break;

		case 2: System.out.println(" Day corresponding to 2 is Monday");

		break;

		case 3: System.out.println(" Day corresponding to 3 is Tuesday");

		break;

		case 4: System.out.println(" Day corresponding to 4 is Wednesday");

		break;

		case 5: System.out.println(" Day corresponding to 5 is Thursday");

		break;

		case 6: System.out.println(" Day corresponding to 6 is Friday");

		break;

		case 7: System.out.println(" Day corresponding to 8 is Saturday");

		break;

		default: System.out.println("Invalid");

		}

	}

}
