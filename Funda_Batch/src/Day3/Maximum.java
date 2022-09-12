package Day3;

public class Maximum {

	public static void main(String[] args) 
	{
		int a=15;
		int b=-5;
		int c=7;
		
		if(a>=b && a>=c)
		{
			System.out.println(a+"is the maximum number");
		}
		else if(b>=a && b>=c)
		{
			System.out.println(b+"is the maximum number");
		}
		else
		{
			System.out.println(c+"is the maximum number");
		}

	}

}
