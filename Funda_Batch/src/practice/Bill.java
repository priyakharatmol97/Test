package practice;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num of pizzas bought:");
		int pizzas=sc.nextInt();
		
		System.out.println("ENter the num of puffs bought:");
		int puffs=sc.nextInt();
		
		System.out.println("ENter the num of cooldrinks bought:");
		int cooldrinks=sc.nextInt();
		
		System.out.println("Bill Details");
		System.out.println("Num of pizzas:"+pizzas);
		System.out.println("Num of puffs:"+puffs);
		System.out.println("Num of cooldrinks:"+cooldrinks);
		System.out.println("Total Price="+(pizzas/100)+(puffs/20)+(cooldrinks/10));
		System.out.println("ENJOY THE SHOW...!!");

	}

}
