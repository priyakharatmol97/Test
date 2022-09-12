package classandobjects;

public class College 
{
	void displayName()
	{
		System.out.println("College Name is:ABC College");
	}
	
	void departments()
	{
		System.out.println("There are total 4 departments");
	}

	
	
	public static void main(String[] args) 
	{
		College c=new College();
		c.displayName();
		c.departments();	

	}

}
