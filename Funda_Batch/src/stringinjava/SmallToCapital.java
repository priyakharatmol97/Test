package stringinjava;

import java.util.Scanner;

public class SmallToCapital {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.next();
		System.out.println("Old String is:"+s);
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				ch[i]='A';
				
			}
			
		}
		String s1=new String(ch);
		System.out.println("New String is:"+s1);
		
	}

}
