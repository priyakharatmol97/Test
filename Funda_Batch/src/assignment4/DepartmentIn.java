package assignment4;

public class DepartmentIn 
{
	int id;
	String name;
	
	StudentIn s;
	
	DepartmentIn(int id,String name,StudentIn s)
	{
		this.id=id;
		this.name=name;
		this.s=s;
	}
	
	public String toString()
	{
		return id+" "+name+" "+s;
	}

}
