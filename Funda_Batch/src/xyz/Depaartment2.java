package xyz;

import java.util.Arrays;

public class Depaartment2 
{
	int id;
	String name;
	Student[] stud;
	
	
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
	
	
	
	public void setStud(Student2[] st)
	{
		this.stud = stud;
	}
	public Student[] getStud() 
	{
		return stud;
	}
	
	public String toString()
	{
		return id+" "+name+"\n"+Arrays.toString(stud);
	}

}
