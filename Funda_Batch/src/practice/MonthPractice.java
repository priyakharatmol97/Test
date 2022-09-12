package practice;

import java.util.Scanner;

public class MonthPractice {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Days");
		
		int day=sc.nextInt();
		int month,week;
		
		int year=day/365;
		month=day/12;
		week=day/7;
		System.out.println("days in year:"+year);
		System.out.println("days in month:"+month);
		System.out.println("days in week:"+week);

	}

}
