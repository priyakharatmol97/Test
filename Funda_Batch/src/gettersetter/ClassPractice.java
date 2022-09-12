package gettersetter;

public class ClassPractice 
{
	private int value1;
	private String value2;
	
	public int getValue1()
	{
		return value1;
	}
	
	public void setValue1(int value1)
	{
		this.value1=value1;
	}
	
	public String getValue2()
	{
		return value2;
	}
	
	public void setValue2(String value2)
	{
		this.value2=value2;
	}
	
	
	
	public class ClassA
	{
	public static void main(String[] args) 
	{
		ClassPractice obj=new ClassPractice();
		obj.setValue1(30);
		obj.setValue2("MNL");
		
		System.out.println("Value1 is"+obj.getValue2());
		System.out.println("Value2 is"+obj.getValue1());
	}
	}
}
