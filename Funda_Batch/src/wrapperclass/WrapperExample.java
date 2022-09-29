package wrapperclass;

public class WrapperExample {

	public static void main(String[] args) 
	{
		int a=20;
		Integer i=new Integer(a); //boxing/wrapping
		
		Integer i1=a;   //autoboxing
		
		Integer a1=300;
		Integer a2=a1;
		
		System.out.println(a1==a2); //compare memory location
		
		

		Integer b1=300;
		Integer b2=400;
		
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
		

		Integer c1=new Integer(a);
		Integer c2=new Integer(a);
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		Integer d1=new Integer(a);
		Integer d2=a;
		
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
		
		Integer f1=new Integer(500);
		
		int e=b1.intValue();//unboxing/unwrapping
		float f=b1.floatValue();
		long l=b1.longValue();
		double d=b1.doubleValue();
		byte bt=b1.byteValue();
		System.out.println(bt);
		short s=b1.shortValue();
		
		int h=b1;  //autounboxing
		
		Float ft=new Float(100.5);
		int y=ft.intValue();		

	}

}
