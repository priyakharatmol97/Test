package assignment1;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		int j;
		for(int i=400;i>=300;i--)
		{
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
					break;
			}
			if(j>i/2)
			{
				System.out.println("Prime number is:"+i);
			}
			/*else
			{
				System.out.println("Non Prime Number is:"+j);
			}*/
		}
		

	}

}
