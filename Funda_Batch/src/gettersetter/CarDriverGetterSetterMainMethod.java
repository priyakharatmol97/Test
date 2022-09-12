package gettersetter;

import Encapsulation.Bike;

public class CarDriverGetterSetterMainMethod {

	public static void main(String[] args)
	{
		DriverGetterSetterUsing  d1=new DriverGetterSetterUsing ();
		d1.setId(101);
		d1.setName("Ramesh");
		d1.setContact("7977956202");
		
		
		/*DriverGetterSetterUsing  d2=new DriverGetterSetterUsing ();
		d2.setId(102);
		d2.setName("Ram");
		d2.setContact("7977654238");*/
		
		
		
		
		CarGetterSetterUsing  c1=new CarGetterSetterUsing ();
		c1.setId(1);
		c1.setName("Priya");
		c1.setCnumber("8976");
		c1.setDriverGetterSetterUsing(d1);
		/*CarGetterSetterUsing  c2=new CarGetterSetterUsing ();
		c1.setId(2);
		c1.setName("Divya");
		c1.setCnumber("9856");
		c1.setDriver("abc");*/
		
		System.out.println(d1.getId()+" "+d1.getName()+" "+" "+d1.getContact());
		System.out.println(c1.getId()+" "+c1.getName()+" "+c1.getCnumber()+" "+c1.getDriverGetterSetterUsing());
		
		
		
		


	}

	


}
