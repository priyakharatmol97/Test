package xyz;

public class Add 
{
	void add(int a,int b)
	{
		System.out.println("Addition of two Integer numbers:"+(a+b));
	}
	
	void add(int a,float b)
	{
		System.out.println("Different parameter:"+(a+b));
	}

	public static void main(String[] args)
	{
		Add d=new Add();
		d.add(10, 20);
		d.add(10, 3.4f);

	}

}
