package containmentusingarray;

public class IdProof
{
	int id;
	String name;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId() 
	{
		return id;
	}
	
	
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	
	public String toString()
	{
		return id+" "+name;
	}
	

}
