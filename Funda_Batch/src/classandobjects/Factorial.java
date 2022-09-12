package classandobjects;

public class Factorial 
{
	void factorial(int a) 
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:"+fact);
	}
	
	void power(int power,int num)
	{
		int product=1;
		for(int i=1;i<=power;i++)
		{
			product=product*num;
		}
		System.out.println("Power is:"+product);
	}

	public static void main(String[] args) 
	{
		Factorial f=new Factorial();
		f.factorial(10);
		f.power(2, 4);

	}

}
