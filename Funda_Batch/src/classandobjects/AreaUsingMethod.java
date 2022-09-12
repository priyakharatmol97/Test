package classandobjects;

import java.util.Scanner;

public class AreaUsingMethod 
{
	void rectangle(float l, float b)
	{
		System.out.println("Area of rectangle is:"+(l*b));
		
	}
	
	void areaCircle(float r)
	{
		System.out.println("Area of circle is:"+(3.14*r*r));
	}

	public static void main(String[] args)
	{
		AreaUsingMethod a= new AreaUsingMethod ();
		a.rectangle(10f, 12f);
		a.areaCircle(32f);
		
		
	}

}
