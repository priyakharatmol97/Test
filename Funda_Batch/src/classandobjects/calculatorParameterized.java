package classandobjects;

public class calculatorParameterized 
{
	void add(float a,int b) 
	{
		System.out.println("The addition is:"+(a+b));
	}
	
	void sub(float a,float b) 
	{
		System.out.println("The substraction is:"+(a-b));
	}
	
	void multi(int a,int b) 
	{
		System.out.println("The multiplication is:"+(a*b));
	}
	
	void div(int a,float b) 
	{
		System.out.println("The division is:"+(a/b));
	}
	
	void pow(float num) 
	{
		System.out.println("The power is:"+(num*num));
	}

	public static void main(String[] args)
	{
		calculatorParameterized c=new calculatorParameterized();
		c.add(79f, 20);
		c.add(10, 80);
		c.sub(30f, 8f);
		c.multi(20, 30);
		c.div(120, 40f);
		c.pow(6f);
		

	}

}
