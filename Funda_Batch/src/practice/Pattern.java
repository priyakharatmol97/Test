package practice;

public class Pattern {

	public static void main(String[] args) 
	{
		for(char i='a';i<='d';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(char i='d'-1;i>='a';i--)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
