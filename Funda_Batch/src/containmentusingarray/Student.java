package containmentusingarray;

public class Student
{
	private int id,mark;
	private String name,email;
	
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
	
	public void setMark(int mark)
	{
		this.mark=mark;
	}
	
	public int getMark()
	{
		return mark;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}

	public String toString()
	{
		return id+" "+name+" "+mark+" "+email;
	}

}
