package whilelooppractice;

import java.util.Scanner;

public class SumOfAllOddNumbers {

	public static void main(String[] args) 
	{
		int sumOfEvenNumbers=0;
		int i=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		while(i<=num)
		{
			if(i%2!=0)
			{
			sumOfEvenNumbers=sumOfEvenNumbers+i;
			}
			i++;
		}
		System.out.println(sumOfEvenNumbers);

	}

}
