package practiceall;

import java.util.Scanner;

public class Rectangle 
{
	/*void rect(int heigth,int weigth)//using methods
	{
		int rect=heigth*weigth;
		System.out.println("The rectangle total value is:"+rect);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first elements");
		int heigth=sc.nextInt();
		System.out.println("Enter the second elements");
		int weigth=sc.nextInt();
		
		Rectangle r=new Rectangle();
		r.rect(heigth, weigth);
	}*/
	public static void main(String[] args) //without method
	{
	int heigth=5;
	int weigth=2;
	int rect=heigth*weigth;
	System.out.println("The rectangle total value is:"+rect);
	}

}
