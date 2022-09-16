package practiceall;

import java.util.Scanner;

public class Radius
{
	void rs(float radius)
	{
		float diameter=2*radius;
		float circumtence=2*(float)3.14*radius;
		float area=(float)3.14*(radius*radius);
		
		System.out.println(diameter);
		System.out.println(circumtence);
		System.out.println(area);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius");
		float radius=sc.nextFloat();
		
		Radius r=new Radius();
		r.rs(radius);

	}

}
