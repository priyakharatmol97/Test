package stringpracticeall;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
	void anagram(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			Arrays.sort(ch1);
			
			for(int i=0;i<ch2.length;i++)
			{
				for(int j=0;j<ch2.length-1;j++)
				{
					if(ch2[j+1]<ch2[j])
					{
						char temp=ch2[j];
						ch2[j]=ch2[j+1];
						ch2[j+1]=temp;
					}
				}
			}
			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));
			
			int cnt=0;
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]==ch2[i])
				{
					cnt++;
				}
			}
			if(cnt==ch1.length)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.next();
		
		System.out.println("Enter second string");
		String s2=sc.next();
		
		Anagram a=new Anagram();
		a.anagram(s1, s2);


	}

}
