package Inheritance;

public class Student 
{
	int id,marks;
	String name;
	
	Student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;

	}
	
	public String toString()
	{
		return id+" "+name+" "+marks;
	}

}
