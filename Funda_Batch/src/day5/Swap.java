package day5;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args)
	{
		    	Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the first no : ");
				int no=sc.nextInt();
				System.out.println("Enter the Second no :");
				int no1=sc.nextInt();
				int no2=no;
				no=no1;
				no1=no2;
				System.out.println("The Swap no are : " +no + " " +no1);
			}

	}


