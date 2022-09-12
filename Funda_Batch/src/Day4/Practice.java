package Day4;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args)
	{
		String str="Priya";
		int password=1234;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username:");
		String s=sc.next();
		
		if(str.equals(s))
		{
			System.out.println("You are autherized user");
			System.out.println("Your Password is:"+password);
			
			
		}
		else
		{
			System.out.println("You are not authorized user please try again..");
		}

	}

}
