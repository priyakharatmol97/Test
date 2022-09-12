package practice;

import java.util.Scanner;

public class PracticeSquare {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the square values:");
		float a=sc.nextInt();
		
		float square=a*a;
		System.out.println("The Square is:"+square);

	}

}
