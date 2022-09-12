package practice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String rev=sc.next();
		
		System.out.println("After Reverse String is:");
		int i=rev.length();
		
		while(i!=0)
		{
			System.out.print(rev.charAt(i-1));
			i--;
		}
		
	}

}
