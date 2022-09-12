package Day3;

import java.util.Scanner;

public class Centi {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length in centimeter:");
		
		float c=sc.nextFloat();        //centimeter
		float m;                       //meter
		float k;                       //kilometer
		
		m=(float)(c/100);
		k=(float)(c/100000);
		
		System.out.println("\n");
		System.out.println("Length in Meter:"+m);
		System.out.println("Length in Kilometer:"+k);
		

	}

}
