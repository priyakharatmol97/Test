package writtenassignment13;

public class Test 
{
	String t_name;
	String test_given_date;
	
	Test(String t_name,String test_given_date)
	{
		this.t_name=t_name;
		this.test_given_date=test_given_date;
	}
	
	public String toString()
	{
		return t_name+" "+test_given_date;
	}
	

}
