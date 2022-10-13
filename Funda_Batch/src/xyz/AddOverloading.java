package xyz;

public class AddOverloading 
{
	void add(int a,int b)
	{
		System.out.println("Addition of integer:"+(a+b));
	}
	void add(int a,float b)
	{
		System.out.println("Addition of two diff values:"+(a+b));
	}

	public static void main(String[] args) 
	{
		AddOverloading a=new AddOverloading();
		a.add(10, 20);
		a.add(12, 1.22f);

	}

}
