
package abstraction;

public abstract class Car 
{
	String color;
	int price;
	
	Car()
	{
		color="color";
		price=0000;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
	
	abstract void engine();
	abstract void features();
	abstract void dashBoard();
	abstract void wheelType();
	
	
	
	
}
