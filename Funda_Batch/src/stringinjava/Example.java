package stringinjava;

import java.util.Scanner;

public class Example
{
	static void sum(String s)
	{
		int sum=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				sum=sum+(ch[i]-48);
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		
		Example e=new Example();
		e.sum(s);
	}

}
