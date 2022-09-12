package Patterns;

public class DiamondSpacePattern {

	public static void main(String[] args) 
	{
		int r=4;
		char ch='a';
		
		
		for(int i=1;i<=r;i++)   //simple loop for i for rows
		{
			for(int k=1;k<=r-i;k++)    //simple loop for spacing
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)        //simple loop for j for columns
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
		
		ch--;
		for(int i=r-1;i>=1;i--)      //reverse the code for again c 
		{
			ch--;
			for(int k=1;k<=r-i;k++)   //simple loop for spacing
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)       
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			
			
		}
		}

	}


