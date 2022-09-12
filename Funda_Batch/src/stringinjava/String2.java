package stringinjava;

import java.util.Arrays;

public class String2 {

	public static void main(String[] args)
	{
		String s1="Language";
		
		System.out.println("Printing character using method");
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i)+" ");
		}
		System.out.println("\n\n");
		
		System.out.println("Printing character without using method");
		char ch[]=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		System.out.println("\n\n");
		
		String s="Java is a good programming language";
		
		
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
		System.out.println("\n");
		
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
		

	}

}
