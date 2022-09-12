package Day2;

import java.util.Scanner;

public class TotalPrice {

	public static void main(String[] args) 
	{
		float totalprice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of pizzas:"+"");
		int pizzas=sc.nextInt();
		
		System.out.println("Enter no of puffs:"+"");
		int puffs=sc.nextInt();
		
		System.out.println("Enter no of cooldrinks:"+"");
		int cooldrinks=sc.nextInt();
		
	
		System.out.println("Bill Details");
		System.out.println("No of pizzas:"+pizzas);
		System.out.println("No of puffs:"+puffs);
		System.out.println("No of colldrinks:"+cooldrinks);
		
		System.out.println("Total Price="+(pizzas/100+puffs/20+cooldrinks/10));
		System.out.println("ENJOY THE SHOW!!!!");
			

	}

}
