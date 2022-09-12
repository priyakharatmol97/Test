package Patterns;

public class DiamondNumberPatternSpace {

	public static void main(String[] args) 
	{
     int r=4;
		
		
		for(int i=1;i<=r;i++)   //simple loop for i for rows
		{
			for(int k=1;k<=r-i;k++)    //simple loop for spacing
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)        //simple loop for j for columns
			{
				System.out.print(i+" ");
			}
			System.out.println();
		
		}
		
		
		for(int i=r-1;i>=1;i--)      //reverse the code for again c 
		{
			
			for(int k=1;k<=r-i;k++)   //simple loop for spacing
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)       //simple loop for j for columns
			{
				System.out.print(i+" ");
			}
			System.out.println();
			

		}
	}

}
