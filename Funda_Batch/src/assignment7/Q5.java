package assignment7;

import java.util.Scanner;

public class Q5 
{
	void substraction(int array1[][],int array2[][],int row1,int row2,int col1,int col2)
	 { 
	    int finalArray[][] =  new int[row1][col1];
	     for(int i = 0; i < row1; i++){  
           for(int j = 0; j < col1; j++)
           { 
           	finalArray[i][j] = array1[i][j] - array2[i][j];  
           }  
     }  
 
       System.out.println("Subtraction of two matrices: ");  
       for(int i = 0; i < row1; i++)
       {  
           for(int j = 0; j < col1; j++){  
              System.out.print(finalArray[i][j] + "  ");  
           }  
           System.out.println();  
        }  
	
}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
	    System.out.println("For first array Enter rows  : ");
	   int row1=s.nextInt();
	   
	   System.out.println("Enter columns : ");
	   int col1=s.nextInt();
	     int array1[][]=new int [row1][col1];
	     System.out.println("Enter array elements : ");
	     for(int i=0;i<row1;i++)
	     {
	    	 for(int j=0;j<col1;j++)
	    	 {
	    		 array1[i][j]=s.nextInt();
	    	 }
	    	 
	     }
	     
	     System.out.println("For Second array Enter rows  : ");
	     int row2=s.nextInt();
	     
	     System.out.println("Enter columns : ");
	     int col2=s.nextInt();
	       int array2[][]=new int [row2][col2];
	       System.out.println("Enter array elements : ");
	       for(int i=0;i<row2;i++)
	       {
	      	 for(int j=0;j<col2;j++)
	      	 {
	      		 array2[i][j]=s.nextInt();
	      	 }
	      	 
	       }
	       System.out.println("1st Aarray : ");  
	       for(int i = 0; i < row1; i++)
	       {  
	           for(int j = 0; j < col1; j++){  
	              System.out.print(array1[i][j] + " ");  
	           }  
	           System.out.println();  
	        }
	       
	       System.out.println("2nd  Aarray : ");  
	       for(int i = 0; i < row1; i++)
	       {  
	           for(int j = 0; j < col1; j++)
	           {  
	              System.out.print(array2[i][j] + " ");  
	           }  
	           System.out.println();  
	        } 
	       
	       Q5 q=new Q5();
	       q.substraction(array1, array2, row1, row2, col1, col2);
		}
	}
	
	