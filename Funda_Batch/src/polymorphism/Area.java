package polymorphism;

public class Area 
{
	void area(int a)
	{
		System.out.println("Square of area is:"+(a*a));
	}
	
	void area(float a)
	{
		System.out.println("Cicle of area is:"+(3.14*a*a));
	}
	
	void area(float l,float b)
	{
		System.out.println("Rectangle of area is:"+(l*b));
	}
	
	void area(int b,int h)
	{
		System.out.println("Triangle of area is:"+((b*h)/2));
	}

	public static void main(String[] args)
	{
		Area a=new Area();
		a.area(10);
		a.area(12.30f);
		a.area(12f, 23.22f);
		a.area(12, 24);
		
		

	}

}
