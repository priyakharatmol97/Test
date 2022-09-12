package gettersetter;

public class Battery
{
	int id,capacity;
	String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public int getCapacity()
	{
		return capacity;
	}
	
	public String toString()
	{
		return id+" "+name+" "+capacity;
	
	}
	

}
