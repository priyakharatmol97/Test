package project2;

public class Book 
{
	int id,price;
	String name;
	
	public Book(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public String toString()
	{
		return id+" "+name+" "+price;
	}

	
}

