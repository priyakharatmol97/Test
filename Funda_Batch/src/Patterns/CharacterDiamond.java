package Patterns;

public class CharacterDiamond {

	public static void main(String[] args)
	{

		
		for(char i='a';i<='d';i++)   //simple loop for i for rows
		{
			for(char j='a';j<=i;j++)        //simple loop for j for columns
			{
				System.out.print(j);
			}
			System.out.println();
	
		}
		
		
		for(char i='d'-1;i>='a';i--)      //reverse the code for again c and -d
		{
			
			for(char j='a';j<=i;j++)       
			{
				System.out.print(j);
			}
			System.out.println();
			
			
		}

	}

}
