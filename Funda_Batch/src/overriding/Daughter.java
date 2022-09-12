package overriding;

public class Daughter extends Father
{
	void vehicle()
	{
		System.out.println("Daughter Has a Scooty");
	}
	
	void house()
	{
		System.out.println("Daughter lives in an Society");
	}
	
	public Father display() //This One Also Nd Child Class Also-Covariant
	{
		System.out.println("Display In Son Class");
		return new Father();
	}
	
	/*public Son display()
	{
		System.out.println("Display In Son Class");
		return new Son();
	}*/


}
