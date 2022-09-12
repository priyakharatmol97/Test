package day9;

import java.util.Scanner;

public class ReverseDoWhile {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int result=0;
	    int remainder;
	    char ch;
	    
	    do
	    {
	    	System.out.println("Enter the number");
			int num=sc.nextInt();
	    
	    
	    while(num>0)
	    {
	    	remainder=num%10;
	    	result=result*10+remainder;
	    	num=num/10; 
	    	
	    }
	    System.out.println("The reverse number is:"+result);
	    System.out.println("Do you want to continue??(y/n)");
        ch=sc.next().charAt(0);
       
      

	}
	    while(ch=='y'||ch=='Y');
	}
}


