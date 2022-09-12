package exammaterial;

import java.util.Scanner;

public class ReturnCircle 
{
	float radiussquare(float r)
	{
		return r*r;
	}
	
	void area(float rsq)
	{
		float area=3.14f*rsq;
		System.out.println("Area of circle is:"+area);
	}

	public static void main(String[] args) 
	{
		ReturnCircle  rc=new ReturnCircle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		float r=sc.nextFloat();
		
		float rsq=rc.radiussquare(r);
		rc.area(rsq);
		
		

	}

}
