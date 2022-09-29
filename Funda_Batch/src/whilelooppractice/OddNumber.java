package whilelooppractice;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a num");
		int num=sc.nextInt();
		int i=521;
		System.out.println("Odd Numbers");
		
		while(i>=num)
		{
			System.out.print(i+" ");
			i=i-2;
		}

	}

}
