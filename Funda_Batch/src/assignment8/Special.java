package assignment8;

import java.util.Scanner;

public class Special 
{
	public static void main(String[] args) 
	{
		int alphabet=0;
		int digit=0;
		int symbol=0;
		
		System.out.println("count alphabet,digit,symbols");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");
		String s=sc.next();
		
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i) >='a' && s.charAt(i) <='z') || (s.charAt(i) >='A' && s.charAt(i) <='Z'))
            {
				alphabet++;
            	
            }
			else if(s.charAt(i) >='0' && s.charAt(i) <='9')
			{
				digit++;
			}
			else
			{
				symbol++;
			}
		}
		//stem.out.println("alphabet="+alphabet+"Digit="+digit+"Symbol="+symbol);
		System.out.println("alphabet="+alphabet+"\nDigit="+digit+"\nSymbol="+symbol);

	}

}
