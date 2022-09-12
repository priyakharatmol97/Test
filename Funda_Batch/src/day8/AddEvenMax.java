package day8;

import java.util.Scanner;

public class AddEvenMax 
{

	public static void main(String[] args) 
	{
		int cnt=0;
		int result=0;
		int min=0,max=0;
		char ch;
		
		Scanner sc=new Scanner(System.in);
		
		do
		{
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		while(num!=0)
		{
			result=num%10;
			cnt++;
			num=num/10;
			cnt++;	
		}

		if(num>max)
		{
			max=num;
		}
		if(num<min)
		{
			min=num;
		}

		System.out.println("number of digit is:"+cnt);	
		System.out.println("max");
		System.out.println("min");
		System.out.println("Do you want to continue??(y/n)");
        ch=sc.next().charAt(0);
	}

	while(ch=='y'||ch=='Y');
}
}



