package ifelse;

import java.util.Scanner;

public class MarksIfElseLoop {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Makrs:");
		
		int Marks=sc.nextInt();
		
		if(Marks>=0 && Marks<=100)  //nested if loop
		
		if(Marks>=35)
		{
			System.out.println("Student is Pass");
		}
		else
		{
			System.out.println("Student is Fail");
		}
		else
		{
			System.out.println("Entered Marks are Inavlid");
		}
		

	}

}
