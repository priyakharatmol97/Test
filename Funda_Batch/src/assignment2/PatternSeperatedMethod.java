package assignment2;

public class PatternSeperatedMethod
{
	void acceptPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println();
	}
	

	void displayPattern()
	{
		int count=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
					if(i%2==1)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
			}
				
			
			
			System.out.println();
			}
		}
	

		

	
	
	public static void main(String[] args)
	{
		PatternSeperatedMethod p=new PatternSeperatedMethod();
		p.acceptPattern();
		p.displayPattern();

	}
	}

	
