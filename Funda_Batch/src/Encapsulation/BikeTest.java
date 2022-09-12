package Encapsulation;

import java.util.Scanner;

public class BikeTest {

	public static void main(String[] args) 
	{
	
		Bike b1=new Bike();
		b1.setId(101);
		b1.setName("Pulsor");
		b1.setPrice(135000);
		b1.setEngine("200cc");
		b1.setColor("Black");
		b1.setEMI(2);
		b1.setPay(1);
		b1.setDiscountPrice(2);
		System.out.println(b1.getId()+" "+b1.getName()+" "+b1.getPrice()+" "+b1.getEngine()+" "+b1.getColor()+" "+b1.getEMI()+" "+b1.getPay()+" "+b1.getDiscountPrice());	 

	}

}
