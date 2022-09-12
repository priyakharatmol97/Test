package ifelse;

import java.util.Scanner;

public class AccountIfElse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Person Age:");
		int age=sc.nextInt();
		
		if(age>=18 && age<=50)
		if(age>=18)
		{
			System.out.println("The Person is Open Account");
		}
		else
		{
			System.out.println("The Person is Not-Open Account");
		}
		else
		{
			System.out.println("Invalid Details");
		}
	}

}
