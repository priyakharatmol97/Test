package day9;

import java.util.Scanner;

public class ThaliDoWhile 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Dish Choice....");
		int ch=sc.nextInt();
		int thali,Price;
		char ch1;
		
		do
		{
		System.out.println("1. Maharashtrain Thali");
		System.out.println("2. Gujrati Thali");
		System.out.println("3. Rajasthani Thali");
		System.out.println("4. Kolhapuri Thali ");
		System.out.println("5. Kokani Thali ");
		
		
		switch(ch)
		{
		case 1: Price=200;
		        System.out.println("Quantity is:");
		        thali =sc.nextInt();
		        
		        System.out.println("Total Price of Maharashtrain Thali is:"+(Price*thali));
		        break;
		        
		        
		case 2: Price=300;
	            System.out.println("Quantity is:");
                thali =sc.nextInt();
                
                System.out.println("Total Price of Gujrati Thali is:"+(Price*thali));
                break;
                
                
                
		case 3: Price=100;
                System.out.println("Quantity is:");
                thali =sc.nextInt();
                
                System.out.println("Total Price of Rajasthani Thali is:"+(Price*thali));
                break;
        
		case 4: Price=150;   
                System.out.println("Quantity is:");
                thali =sc.nextInt();
                
                System.out.println("Total Price of Kolhapuri Thali is:"+(Price*thali));
                break;
                
		case 5: Price=80;
                System.out.println("Quantity is:");
                thali =sc.nextInt();
                
                System.out.println("Total Price of Kokani Thali is:"+(Price*thali));
                break;
                
                
        default: System.out.println("Invalid choice");
		        
		}
		
		 System.out.println("Do you want to continue??(y/n)");
	     ch1=sc.next().charAt(0);

	}
	while(ch1=='y'||ch1=='Y');

		}
	}

