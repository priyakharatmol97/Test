package Inheritance;

public class GrandFather 
{
	String FN,MN;
	static String LN;
	
	void setGrandFatherData(String FN,String MN,String LN)
	{
		this.FN=FN;
		this.MN=MN;
		this.LN=LN;
	}
	void display()
	{
		System.out.println(FN+" "+MN+" "+LN);
	}

}
