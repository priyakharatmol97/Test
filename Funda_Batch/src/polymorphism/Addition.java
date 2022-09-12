package polymorphism;

public class Addition 
{
	void add(int a,int b)
	{
		System.out.println("Addition on Integer Number is:"+(a+b));
	}
	
	void add(float a,float b)
	{
		System.out.println("Addition of Decimal Number is:"+(a+b));
	}
	
	void add(String a,int b,float c)
	{
		System.out.println("Addition of different Number is:"+(a+b+c));
	}
	
	void add(int a,String b)
	{
		System.out.println("Addition of String Number is:"+(a+b));
	}
	

	public static void main(String[] args) 
	{
		Addition a=new Addition();
		a.add(10, 20);
		a.add(12.30f, 45.90f);
		a.add(30, "abc");
		a.add("xyz", 30, 43.90f);

	}

}
