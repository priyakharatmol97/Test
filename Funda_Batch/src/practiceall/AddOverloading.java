package practiceall;

public class AddOverloading 
{
	void add(int a,int b)
	{
		System.out.println("Addition of two Integer num:"+(a+b));
	}
	
	void add(float a,float b)
	{
		System.out.println("Addition of two float num:"+(a+b));
	}
	
	void add(int a,float b)
	{
		System.out.println("Addition of diff num:"+(a+b));
	}
	
	void add(float a,int b)
	{
		System.out.println("Addition of diff num:"+(a+b));
	}
	
	

	public static void main(String[] args)
	{
		AddOverloading a=new AddOverloading();
		a.add(10, 20);
		a.add(20.5f, 23.67f);
		a.add(20,5.4f);
		a.add(0.9f, 20);

	}

}
