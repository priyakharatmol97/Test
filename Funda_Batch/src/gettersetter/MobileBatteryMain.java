package gettersetter;

public class MobileBatteryMain {

	public static void main(String[] args)
	{
		Battery b=new Battery();
		b.setName("Lithium-Ion");
		b.setCapacity(10);
		
		
		Mobile m=new Mobile();
		m.setName("Apple");
		m.setPrice(50000);
		
		System.out.print(m.getName()+" "+m.getPrice()+" ");
		System.out.println(b.getName()+" "+b.getCapacity());
		
		Battery b2=new Battery();
		b2.setName("Xiaomi");
		b2.setCapacity(12);
		

		Mobile m2=new Mobile();
		m2.setName("Readmi");
		m2.setPrice(20000);
		
		System.out.print(m2.getName()+" "+m2.getPrice()+" ");
		System.out.println(b2.getName()+" "+b2.getCapacity());
		
		Battery b3=new Battery();
		b3.setName("Lithium-Polymer");
		b3.setCapacity(8);
		

		Mobile m3=new Mobile();
		m3.setName("Samsung");
		m3.setPrice(18000);
		
		System.out.print(m3.getName()+" "+m3.getPrice()+" ");
		System.out.println(b3.getName()+" "+b3.getCapacity());
		
		Battery b4=new Battery();
		b4.setName("Long-Power");
		b4.setCapacity(20);
		

		Mobile m4=new Mobile();
		m4.setName("Vivo");
		m4.setPrice(25000);
		
		System.out.print(m4.getName()+" "+m4.getPrice()+" ");
		System.out.println(b4.getName()+" "+b4.getCapacity());
		
		Battery b5=new Battery();
		b5.setName("Notes");
		b5.setCapacity(15);
		

		Mobile m5=new Mobile();
		m5.setName("Oppo");
		m5.setPrice(12000);
		
		System.out.print(m5.getName()+" "+m5.getPrice()+" ");
		System.out.println(b5.getName()+" "+b5.getCapacity());
		

	}

}
