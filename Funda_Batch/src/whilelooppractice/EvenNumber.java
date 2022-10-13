package whilelooppractice;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a num");
		int num=sc.nextInt();
		int i=121;
		System.out.println("Even Numbers");
		
		while(i!=num)
		{
			System.out.print(i+" ");
			i=i+2;
		}

	}

}
