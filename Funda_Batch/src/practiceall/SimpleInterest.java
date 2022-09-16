package practiceall;

import java.util.Scanner;

public class SimpleInterest 
{
	void SI(float principle,float rate,float time)
	{
		float SI=principle*rate*time/100;
		System.out.println("Simple Interest:"+SI);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle value:");
		float principle=sc.nextInt();
		System.out.println("Enter the rate value");
		float rate=sc.nextInt();
		System.out.println("Enter the time value");
		float time=sc.nextInt();
		
		
		SimpleInterest s=new SimpleInterest();
		s.SI(principle, rate, time);
	}

}
