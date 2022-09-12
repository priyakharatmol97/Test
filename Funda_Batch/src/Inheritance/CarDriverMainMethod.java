package Inheritance;

public class CarDriverMainMethod {

	public static void main(String[] args)
	{
		Driver d1=new Driver(1,"Priya","7977956202");
		Driver d2=new Driver(2,"Ramesh","9703568960");
		Driver d3=new Driver(3,"Diya","7988946503");
		
		Car c1=new Car(101,"Baleno","7869",d1);
		Car c2=new Car(102,"Swift","8749",d2);
		Car c3=new Car(103,"Nexon","2937",d3);
		
		System.out.println(c1);
		System.out.println();
		System.out.println(c2);
		System.out.println();
		System.out.println(c3);

	}

}
