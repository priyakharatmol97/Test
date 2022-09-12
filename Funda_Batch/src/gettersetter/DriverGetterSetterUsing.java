package gettersetter;

public class DriverGetterSetterUsing 
{
	int id;
	String name,contact;
	
	
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
	
	public void setContact(String i)
	{
		this.contact=i;
	}
	public String getContact()
	{
		return contact;
	}
	
	public String toString()
	{
		return id+" "+name+" "+contact;
	
	}
	
}
