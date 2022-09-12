package stringinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String s1=sc.next();
		
		System.out.println("Enter Second String");
		String s2=sc.next();
		
		if(s1.length()==s2.length())
		{
			char arr1[]=s1.toCharArray();
			Arrays.sort(arr1);
			
			
			char arr2[]=s2.toCharArray();
			Arrays.sort(arr2);
			
			
			boolean result=Arrays.equals(arr1, arr2);
			
			if(result)
			{
				System.out.println("Strings are Anagrams");
			}
			
		else
		{
			System.out.println("Strings are not Anagrams");
		}

	}

}
}
