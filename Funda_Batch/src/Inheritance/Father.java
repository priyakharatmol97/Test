package Inheritance;

public class Father extends GrandFather
{
	String FN;
	
	void setFatherData(String FN)
	{
		this.FN=FN;
	}
	
	void display()
	{
		super.display();
		System.out.println(FN+" "+super.FN+" "+LN);
		
	}
}
