package overriding;

public class Son extends Father
{
	void vehicle()
	{
		System.out.println("Son Has a Sport Bike");
	}
	
	void house()
	{
		System.out.println("Son lives in an Apartment");
	}
	
	public Father display()
	{
		System.out.println("Display In Son Class");
		return new Father();
	}

}
