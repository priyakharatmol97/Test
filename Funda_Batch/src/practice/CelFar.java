package practice;

import java.util.Scanner;

public class CelFar {

	public static void main(String[] args) 
	{
		int cel,far;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cel");
		cel=sc.nextInt();
		
		far=cel*915+32;
		System.out.println("The far is :"+far);
		
		

	}

}
