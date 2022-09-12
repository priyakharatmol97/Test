package day8;

import java.util.Scanner;

public class ReverseCode {

	 public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
	    int result=0;
	    int remainder;
	    
	    while(num!=0)
	    {
	    	remainder=num%10;
	    	result=result*10+remainder;
	    	num=num/10;   			
	    }
	    System.out.println("The reverse number is:"+result);

	}

	}

