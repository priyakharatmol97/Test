package assignment2;

public class Clinic 
{
	int c_id;
	Float rating;
	String c_name,location;
	Doctor d;
	
	Clinic(int c_id,String c_name,String location,Float rating,Doctor d)
	{
		this.c_id=c_id;
		this.c_name=c_name;
		this.location=location;
		this.rating=rating;
		this.d=d;
	}
	
	public String toString()
	{
		return c_id+" "+c_name+" "+location+" "+rating+" "+d;
	}
}
