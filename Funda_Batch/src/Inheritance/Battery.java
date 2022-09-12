package Inheritance;

public class Battery 
{
	int id,capacity;
	String name;
	
	Battery(int id,String name,int capacity)
	{
		this.id=id;
		this.name=name;
		this.capacity=capacity;
	}
	public String toString()
	{
		return id+" "+name+" "+capacity;
	}

}
