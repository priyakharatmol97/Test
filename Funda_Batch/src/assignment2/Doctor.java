package assignment2;

public class Doctor 
{
	int d_id;
	String d_name;
	
	Doctor(int d_id,String d_name)
	{
		this.d_id=d_id;
		this.d_name=d_name;
	}
	
	public String toString()
	{
		return d_id+" "+d_name;
	}

}
