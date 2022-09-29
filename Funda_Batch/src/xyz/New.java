package xyz;

import java.util.Arrays;

public class New {

	public static void main(String[] args) 
	{
		String s="Java is a good programming language";
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
		
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
		
	}

}
