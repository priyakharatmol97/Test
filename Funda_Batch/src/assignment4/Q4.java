package assignment4;

public class Q4 
{
	double series(double n)
	{
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			double series=1.0/i;
			sum=sum+series;
		}
		return sum;
	}
	
	
	double series(double a,double n)
	{
		double sum=0;
		int x=1;
		for(int i=1;i<=x;i++)
		{
			int e=x+1;
			double series=x;
			sum=sum+series;
			x=x+3;
		}
		return sum;
	}
	

	public static void main(String[] args) 
	{
		Q4 q=new Q4();
		System.out.println("Sum Of First Series Is:"+q.series(5));
		System.out.println("Sum Of Second Series Is:"+q.series(3,8));

	}

}
