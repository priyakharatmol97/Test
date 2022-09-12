package exammaterial;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int temp=num;
		int cnt=0;
	 
		while(temp!=0)
		{
			cnt++;
			temp=temp/10;
		}
		temp=num;
		int sum=0;
		
		while(temp!=0)
		{
			int product=1;
			int r=temp%10;
			for(int i=1;i<=cnt;i++)
			{
				product=product*r;
			}
			sum=sum+product;
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}

	}

}
