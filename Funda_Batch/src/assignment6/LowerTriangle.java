package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class LowerTriangle 
{
	void matrix(int row,int columns,int arr[][])
	{
		System.out.println("The Elements of the Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		//System.out.println(Arrays.toString(matrix));
	}
	void lTMatrix(int row,int columns,int arr[][])
	{
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				
				if(i>j)
				{
					
				   sum=sum+arr[i][j];
				}
				System.out.println(" ");
			}
		}
		
		System.out.println("The sum of Lower Triangle Matrix:"+sum);
		System.out.println(" ");
		
	}
	
	
	void UMatrix(int row,int columns,int arr[][])
	{
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				
				if(j>i)
				{
					System.out.println(" ");
				   sum=sum+arr[i][j];
				}
				System.out.println(" ");
			}
		}
		
		System.out.println("The sum of Lower Triangle Matrix:"+sum);
		System.out.println(" ");
		
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Rows:");
		int row=sc.nextInt();
		
		System.out.println("Enter the Number of Columns:");
		int columns=sc.nextInt();
		
		int arr[][] =new int[row][columns];
		
		System.out.println("Enter the elements of the Lower Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr[i][j] = sc.nextInt();

			}
		}
		
		LowerTriangle l=new LowerTriangle();
		
		l.lTMatrix(row, columns, arr);
		l.matrix(row, columns, arr);
	}

	}


/*Output:
	Enter the Number of Rows:
		3
		Enter the Number of Columns:
		3
		Enter the elements of the Lower Matrix
		1
		2
		3
		4
		5
		6
		7
		8
		9
		 
		The sum of Lower Triangle Matrix:19
		 
		The Elements of the Matrix
		1 2 3  
		4 5 6  
		7 8 9  
		*/

	