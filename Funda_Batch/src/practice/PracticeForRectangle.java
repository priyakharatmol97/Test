package practice;

import java.util.Scanner;

public class PracticeForRectangle {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height:");
		float height=sc.nextFloat();
		
		System.out.println("Enter the width:");
		float width=sc.nextFloat();
		
		float rectangle=height*width;
		System.out.println("The Result is:"+rectangle);
	}

}
