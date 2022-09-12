package constructor;

import java.util.Scanner;

public class Car 
{
	int id,price,launchYear;
	String name,brand;
	
	Car()
	{
		id=00;
		name="name";
		brand="brand";
		launchYear=0000;
		price=-1;
	}
	
	Car(int i,String n,String b, int l,int p)
	{
		id=i;
		name=n;
		brand=b;
		launchYear=l;
		price=p;
	}
	
	public String toString()//override toString method of object class
	{
		return id+" "+name+" "+brand+" "+launchYear+" "+price;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+brand+" "+launchYear+" "+price);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Car id:");
		int id=sc.nextInt();
		System.out.println("Enter Car name:");
		String name=sc.next();
		System.out.println("Enter Car brand:");
		String brand=sc.next();
		System.out.println("Enter Car launchyear:");
		int launchYear=sc.nextInt();
		System.out.println("Enter Car price:");
		int price=sc.nextInt();
		System.out.println();
		Car c1=new Car(id,name,brand,launchYear,price);
		
		
		
		System.out.println("Enter Car id:");
		id=sc.nextInt();
		System.out.println("Enter Car name:");
		name=sc.next();
		System.out.println("Enter Car brand:");
		brand=sc.next();
		System.out.println("Enter Car launchyear:");
		launchYear=sc.nextInt();
		System.out.println("Enter Car price:");
		price=sc.nextInt();
		System.out.println();
		Car c2=new Car(id,name,brand,launchYear,price);
		
		Car c3=new Car();
		
		System.out.println("**------Details About The Car-------**");
		System.out.println();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		/*c1.display();
		c2.display();*/
		
		
		

	}

}
