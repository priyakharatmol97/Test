package Day4;

import java.util.Scanner;

public class Div {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		if(num%5==0 && num%11==0)
		{
			System.out.println("This number is Divisible by 5 and 11");
		}
		else
		{
			System.out.println("This number is not Divisible by 5 and 11");
		}
			

	}

}
