package practice;

import java.util.Scanner;

public class RadiusPractice {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		int r=sc.nextInt();
		
		float d=2*r;
		float c=2*(float)3.14*r;
		float a=(float)3.14*r*r;
		
		System.out.println("Diameter is:"+d+"units");
		System.out.println("Circumstace is"+c+"units");
		System.out.println("Area is"+a+"sq.units");
		
		

	}

}
