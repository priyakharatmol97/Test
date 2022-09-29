package whilelooppractice;

import java.util.Scanner;

public class BaseIndexCalculatePower {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the base number");
		int base=sc.nextInt();
		
		
		System.out.println("ENter the index");
		int index=sc.nextInt();
		
		long result=1;
		System.out.println("Calculate Power Of Base and Index");
		System.out.println(base+" "+index);
		
		while(index!=0)
		{
			result=base*result;
			index--;
		}
		System.out.print("\n"+result);
		
		

	}

}
