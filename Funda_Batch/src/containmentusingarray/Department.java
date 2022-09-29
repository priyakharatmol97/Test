package containmentusingarray;

import java.util.Arrays;

public class Department 
{
	private int id;
	private String name;
	private Student stud[];
	
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
	
	
	public void setStud(Student[] stud) 
	{
		this.stud = stud;
	}
	
	public Student[] getStud() 
	{
		return stud;
	}
	
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(stud);
	}

}
