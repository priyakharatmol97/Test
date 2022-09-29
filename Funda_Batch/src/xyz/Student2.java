package xyz;

import java.util.Arrays;

public class Student2 
{
	int id,marks;
	String name,email;
	private Depaartment2[] dept;
	
	
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	
	
	public void setMarks(int marks) 
	{
		this.marks = marks;
	}
	public int getMarks() 
	{
		return marks;
	}
	
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	
	
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getEmail() 
	{
		return email;
	}
	
	public void setDept(Depaartment2[] dept)
	{
		this.dept = dept;
	}
	
	public Depaartment2[] getDept() 
	{
		return dept;
	}
	
	public String toString()
	{
		return id+" "+marks+" "+name+" "+email+" "+Arrays.toString(dept);
	}


	

}
