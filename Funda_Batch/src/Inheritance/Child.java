package Inheritance;

public class Child extends Father
{
	String FN;
	
	void setChildData(String FN)
	{
		this.FN=FN;
	}
	
	void display()
	{
		super.display();
		System.out.println(FN+" "+super.FN+" "+LN);
		
	}
	
	

}
