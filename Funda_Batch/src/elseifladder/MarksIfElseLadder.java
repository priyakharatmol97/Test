package elseifladder;

import java.util.Scanner;

public class MarksIfElseLadder {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Marks:");
		int Marks=sc.nextInt();
	
		if(Marks>=0 && Marks<=100)
		{
		if(Marks<=100 && Marks>=80)
		System.out.println(" The Student is Pass With A+ Grade");
		
		else if(Marks<80 && Marks>=60)
		System.out.println("The Student is Pass With A Grade");
		
	
		else if(Marks<60 && Marks>=50)
		System.out.println("The Student is Pass With B Grade");
		
		else if(Marks<50 && Marks>=35)
		System.out.println("The Student is Pass With C Grade");
		
		
		else
		System.out.println("Fail");
		
		}

	}

}

