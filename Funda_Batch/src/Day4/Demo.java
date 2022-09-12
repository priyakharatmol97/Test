package Day4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any item");
		
		String item=sc.next();
		System.out.println("Enter any price");
		int price=sc.nextInt();
		
		int totalprice=0;
		
		if(price>50000)
		{
			System.out.println("Excellent Quality");
			System.out.println("How many qyantities you required");
			int quantity=sc.nextInt();
			totalprice=quantity*price;
			System.out.println("total price of items is"+totalprice);
		}
		else if(price>25000)
		{
			System.out.println("good quality");
			System.out.println("How many quantities you required?");
			int quantity=sc.nextInt();
			totalprice=quantity*price;
			System.out.println("total price of items is"+totalprice);
			
		}
		else
		{
			System.out.println("poor quality");
		}
		

	}

}
