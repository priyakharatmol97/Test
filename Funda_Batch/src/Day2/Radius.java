package Day2;

import java.util.Scanner;

public class Radius {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		
		float r=sc.nextFloat();
		float d;
		float c;
		float a;
		
		d=2*r;
		c=2*(float)3.14*r;
		a=(float)3.14*(r*r);
		
		System.out.println("\n");
		System.out.println("Diameter ="+d+"units");
		System.out.println("Circumference ="+c+"units");
		System.out.println("Area ="+a+"sq.units");
		

	}

}
