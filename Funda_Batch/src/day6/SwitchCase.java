package day6;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
	{
		//char ch='A';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character:");
		char ch=sc.next().charAt(0);
		//if(ch=='a'||ch=='u'|| ch=='o'|| ch=='i'|| ch=='e')
		
		switch(ch)
		{
		case 'a' :System.out.println("Vowel");
		break;
		
		
		case 'e' :System.out.println("Vowel");
		break;
		
		
		case 'i' :System.out.println("Vowel");
		break;
		
		
		case 'o' :System.out.println("Vowel");
		break;
		
		case 'u' :System.out.println("Vowel");
		break;
		
		case 'A' :System.out.println("Vowel");
		break;
		
		case 'O' :System.out.println("Vowel");
		break;
		
		case 'I' :System.out.println("Vowel");
		break;
		
		case 'E' :System.out.println("Vowel");
		break;
		
		case 'U' :System.out.println("Vowel");
		break;
		
		default: System.out.println("Consonant");

	}
		System.out.println("Done");

	}
}