package containmentusingarray;

public class Movies 
{
	int id,boc,year;
	String name;
	
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	
	public void setBoc(int boc) 
	{
		this.boc = boc;
	}
	public int getBoc() 
	{
		return boc;
	}
	
	
	
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getYear()
	{
		return year;
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
		return id+" "+name+" "+boc+" "+year;
	}
	

}
