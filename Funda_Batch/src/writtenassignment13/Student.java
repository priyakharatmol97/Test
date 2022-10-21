package writtenassignment13;

import java.util.ArrayList;

public class Student 
{
	int id;
	String s_name;
	ArrayList<Test> t;
	
	Student(int id,String s_name,ArrayList<Test> t)
	{
		this.id=id;
		this.s_name=s_name;
		this.t=t;
	}
	
	public String toString()
	{
		return id+" "+s_name+" "+t;
	}

}
