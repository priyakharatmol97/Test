package assignment4;

public class StudentIn 
{
	int rollNo;
	String name;
	
	StudentIn(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public String toString()
	{
		return rollNo+" "+name;
	}
	

}
