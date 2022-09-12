package assignment2;

import java.util.Scanner;

public class Box
{
	void calculateVolume(float l,float w,float h)
	{	
		System.out.println("The volume of box is:"+(l*w*h));
			
	}
	

	public static void main(String[] args) 
	{
		
		Box b=new Box();
		b.calculateVolume(20f,10f,32f);		

	}

}
