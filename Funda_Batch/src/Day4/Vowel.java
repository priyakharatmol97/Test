package Day4;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		
		if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("The Character is an Vowel");
		}
		else
		{
			System.out.println("The Character is an Consonant");
		}
		
	}

}
