package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonal 
{
	void diagonal(int row,int columns,int matrix[][])
	{
		System.out.println("The Elements of the Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
		//System.out.println(Arrays.toString(matrix));
	}
	
	
	void sum(int row,int columns,int matrix[][])
	{
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(i==j)
				{
					sum= sum+matrix[i][j];
				}
			}
	}
		//System.out.println(Arrays.toString(matrix));
System.out.println("Sum of Diagonl elements of the matrix:"+sum);

}
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Rows:");
		int row=sc.nextInt();
		
		System.out.println("Enter the Number of Columns:");
		int columns=sc.nextInt();
		
		int [][] matrix =new int[row][columns];
		
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		
		SumOfDiagonal s=new SumOfDiagonal();
		s.diagonal(2, 2, matrix);
		s.sum(2,2, matrix);
			
	}
}


/* Output :
Enter the Number of Rows:
2
Enter the Number of Columns:
2
Enter the elements of the matrix
1
2
3
4
The Elements of the Matrix
1 2  
3 4  
Sum of Diagonl elements of the matrix:5
*/

