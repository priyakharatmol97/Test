package forloop;

import java.util.Scanner;

public class ExampleForLoop {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int no=sc.nextInt();
		
		int i;
		for(i=1;i<=10;i++)
		//for(i=10;i>=1;i--)
		{
			if(i==5)
				continue;
			if(i==8)
				//continue;
				break;
			System.out.println(i*no);
		}
		//System.out.println("out of for loop is i=:"+i);

	}

}
