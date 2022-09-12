package Inheritance;

public class Car
{
	int id;
	String name,cnumber;
	Driver d;
	
	
	Car(int id,String name,String cnumber,Driver d)
	{
		this.id=id;
		this.name=name;
		this.cnumber=cnumber;
		this.d=d;	
	}
	
	public String toString()
	{
		return id+" "+name+" "+cnumber+" "+d;
	}

}
