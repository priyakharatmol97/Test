package day5;
import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Restaurant name");
		String restaurant=sc.next();
		
		System.out.println("Welcome to Restaurant...."+restaurant);
		
		System.out.println("choose your menu");
		System.out.println("1.vegeterian");
		System.out.println("2.non-vegeterian");
		
		System.out.println("Enter your chice");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			int r = 200;
			int d =100;
			int cold =20;
			System.out.println("Rice Price is Rs.200....");
			System.out.println("Daal Price is Rs.100....");
			System.out.println("Enter the Dish");
			String dish1 = sc.next();
		
			System.out.println("Enter the Dish2");
			String dish2 = sc.next();
			int totalprice =r+d+cold;
			System.out.println("total price is:"+totalprice);
			
		}
		if(choice==2)
		{
			int moton = 200;
			int bread =100;
			int cold =20;
			System.out.println("moton Price is Rs.200....");
			System.out.println("bread Price is Rs.100....");
			System.out.println("Enter the Dish");
			String dish1 = sc.next();
		
			System.out.println("Enter the Dish2");
			String dish2 = sc.next();
			int totalprice = moton+ bread+cold;
			System.out.println("total price is:"+totalprice);
			
		}
	
		
	

	}

}
