package Inheritance;

public class MobileBatteryMain {

	public static void main(String[] args) 
	{
		Battery b2=new Battery(1,"Lithium-Ion",10);
		Battery b3=new Battery(2,"Xiaomi",20);
		Battery b4=new Battery(3,"Lithium-Polymer",30);
		Battery b5=new Battery(4,"Long-Power",40);
		Battery b6=new Battery(5,"Notes",50);
		
		Mobile m1=new Mobile(101,"Samsung",20000,b2);
		Mobile m2=new Mobile(102,"Readmi",18000,b3);
		Mobile m3=new Mobile(103,"Apple",40000,b4);
		Mobile m4=new Mobile(104,"Vivo",22000,b5);
		Mobile m5=new Mobile(105,"Oppo",12000,b6);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);

	}

}
