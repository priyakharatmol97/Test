package assignment7;

import java.util.Scanner;

import assignment6.LowerTriangle;

public class Q3
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
			
			System.out.println("The sum of Upper Triangle Matrix:"+sum);
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
			
			Q3 l=new Q3();
			
			l.lTMatrix(row, columns, arr);
			l.matrix(row, columns, arr);
		}

		}







