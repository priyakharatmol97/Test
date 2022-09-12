package stringinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2
{
	void anagram(String s1,String s2) 
	{
		if(s1.length()==s2.length())
		{
			char ch1[]= s1.toCharArray();
			char ch2[]= s2.toCharArray();
			Arrays.sort(ch1);                   //with method
			
			for(int i=0;i<ch2.length;i++)           //without method
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
			    //if(ch1[i]!=ch2[i])
					
				{
					//break;
					cnt++;
				}
				//else
					//cnt++;
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
		System.out.println("Enter First String");
		String s1=sc.next();
		
		System.out.println("Enter Second String");
		String s2=sc.next();
		
		Anagram2 a=new Anagram2();
		a.anagram(s1, s2);

	}

}
