package Inheritance;

public class Mobile
{

	int id,price;
	String name;
	
	Battery b;
	
	Mobile(int id,String name,int price,Battery b)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.b=b;
	
	}
	
	public String toString()
	{
		return id+" "+name+" "+price+" "+b;
	}


}
