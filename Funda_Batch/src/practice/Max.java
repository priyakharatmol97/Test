package practice;

import java.util.Scanner;

public class Max {

	public static void main(String[] args)
	{
		int n1=90;
		int n2=70;
		int n3=7;
		
		if(n1>=n2 && n1>=n3)
		{
			System.out.println(n1+"Maximun");
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println(n2+"Maximum");
		}
		else
		{
			System.out.println(n2+"Minimum");
		}
		
		

	}

}
