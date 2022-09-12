package classandobjects;

public class Addition
{
	void add()
	{
		int a=10,b=20;       //local variable
		System.out.println("Addition of Two Number is:"+(a+b));
	}
	
	void sub()
	{
		int a=10,b=20;
		System.out.println("Substraction of Two Number is:"+(a-b));
		multi();
	}

	
	void multi()
	{
		int a=10,b=20;
		System.out.println("Multiplication of Two Number is:"+(a*b));
		
	}

	
	void div()
	{
		int a=10,b=20;
		System.out.println("Division of Two Number is:"+(a/b));
		pow();
	}

	
	void pow()
	{
		int b=20;
		System.out.println("Power of Two Number is:"+(b*b));
	}


	public static void main(String[] args) 
	{
		Addition a= new Addition();
		a.add();
		a.sub();
		//a.multi();
		a.div();
		//a.pow();

	}

}
