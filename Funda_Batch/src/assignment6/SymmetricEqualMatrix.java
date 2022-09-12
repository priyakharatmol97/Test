package assignment6;

import java.util.Scanner;

public class SymmetricEqualMatrix 
{
	void Matrix(int row,int columns,int matrix[][])
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
	}
	
	
	
	
	void symmetric(int row,int columns,int transpose[][],int matrix[][])
	{
				if(row!=columns)
				{
					System.out.println("The given matrix is not equal to transpose matrix");
				}
				else
				{
					boolean symmentric=true;
					for(int i=0;i<row;i++)
					{
					for(int j=0;j<columns;j++)
					{
						if(matrix[i][j]!=matrix[j][i])
						{
							symmentric=false;
							break;
						}
					}
				}
					
					if(symmentric)
					{
						System.out.println("The given matrix is symmetric");
					}
					else
					{
						System.out.println("The given matrix is not symmetric");
					}
						
					}
			}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Rows:");
		int row=sc.nextInt();
		
		System.out.println("Enter the Number of Columns:");
		int columns=sc.nextInt();
		
		int arr[][] =new int[row][columns];
		
		System.out.println("Enter the elements of the symmetric Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr[i][j] = sc.nextInt();

			}
		}
		
		SymmetricEqualMatrix s=new SymmetricEqualMatrix();
		s.Matrix(row, columns, arr);
		s.symmetric(row, columns, arr, arr);
		
		

	}

}

/* Output:
 Enter the Number of Rows:
3
Enter the Number of Columns:
3
Enter the elements of the symmetric Matrix
7
5
1
5
8
3
1
3
4
The Elements of the Matrix
7 5 1  
5 8 3  
1 3 4  
The given matrix is symmetric
 */

