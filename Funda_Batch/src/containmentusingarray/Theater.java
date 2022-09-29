package containmentusingarray;

import java.util.Arrays;

public class Theater 
{
	int id;
	String name;
	Movies m[];
	
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public Movies[] getM() 
	{
		return m;
	}
	public void setM(Movies[] m) 
	{
		this.m = m;
	}
	
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(m);
	}

	
	

}
