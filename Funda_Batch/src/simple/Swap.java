package simple;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter first no");
		int no1=sc.nextInt();
		
		System.out.println("ENter second no");
		int no2=sc.nextInt();
		
		int no3=no1;
		no1=no2;
		no2=no3;
		
		System.out.println(no1+" "+no2);
		

	}

}
