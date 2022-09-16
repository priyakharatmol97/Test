package practiceall;

import java.util.Scanner;

public class TotalPrice {

	public static void main(String[] args) 
	{
		float totalprice;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of pizzas bought");
		int pizzas=sc.nextInt();
		
		System.out.println("Enter the number of puffs bought");
		int puffs=sc.nextInt();
		
		System.out.println("Enter the number of cooldrinks bought");
		int cooldrinks=sc.nextInt();
		
		System.out.println("Bill Details");
		System.out.println("Number of pizzas:"+pizzas);
		System.out.println("Number of puffs:"+puffs);
		System.out.println("Number of cooldrinks:"+cooldrinks);
		System.out.println("Totalprice is:"+(pizzas/100+puffs/20+cooldrinks/100));
		System.out.println("ENJOY THE SHOWS");
		

	}

}
