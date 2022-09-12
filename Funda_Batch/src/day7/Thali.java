package day7;

import java.util.Scanner;

public class Thali {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Dish Choice....");
		int ch=sc.nextInt();
		int thali,Price=150;
		
		System.out.println("1. Maharashtrain Thali");
		System.out.println("2. Gujrati Thali");
		System.out.println("3. Rajasthani Thali");
		System.out.println("4. Kolhapuri Thali ");
		System.out.println("5. Kokani Thali ");
		
		
		switch(ch)
		{
		case 1:
		        System.out.println("Quantity is:");
		        thali =sc.nextInt();
		        
		        System.out.println("Total Price of Maharashtrain Thali is:"+(Price*thali));
		        break;
		        
		        
		case 2: System.out.println("Please Enter The Price of Gujrati Thali...");
                Price=sc.nextInt();
        
	            System.out.println("Quantity is:");
                thali =sc.nextInt();
                
                System.out.println("Total Price of Gujrati Thali is:"+(Price*thali));
                break;
                
                
                
		case 3: System.out.println("Please Enter The Price of Rajasthani Thali...");
                Price=sc.nextInt();

                System.out.println("Quantity is:");
                thali =sc.nextInt();
                
                System.out.println("Total Price of Rajasthani Thali is:"+(Price*thali));
                break;
        
		case 4: System.out.println("Please Enter The Price of Kolhapuri Thali...");
                Price=sc.nextInt();

                
                System.out.println("Quantity is:");
                thali =sc.nextInt();
                
                System.out.println("Total Price of Kolhapuri Thali is:"+(Price*thali));
                break;
                
		case 5: System.out.println("Please Enter The Price of Kokani Thali...");
                Price=sc.nextInt();
                

                System.out.println("Quantity is:");
                thali =sc.nextInt();
                
                System.out.println("Total Price of Kokani Thali is:"+(Price*thali));
                break;
                
                
        default: System.out.println("Invalid choice");
		        
		        
		}

	}

}
