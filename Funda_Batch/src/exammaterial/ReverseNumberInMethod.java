package exammaterial;

import java.util.Scanner;

public class ReverseNumberInMethod 
{
   void reverse()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number:");
	   int num=sc.nextInt();
	   int result=0;
	   int remainder;
	   
	   while(num!=0)
	   {
		   remainder=num%10;
		   result=result*10+remainder;
		   num=num/10;
	   }
	   System.out.println("The Reverse Number is:"+result);
   }
	public static void main(String[] args) 
	{
		ReverseNumberInMethod r=new ReverseNumberInMethod();
		r.reverse();

	}

}
