package Day2;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) 
	{
		float cel,far;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp in Celsius:");
		cel=sc.nextFloat();
		
		far=cel*9/5+32;
		
		System.out.println("Temp in Fahrenheit:"+far);
		
		
	}

}
