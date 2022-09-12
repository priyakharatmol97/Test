package Day2;
import java.util.Scanner;
public class Day {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Days");
		
		int day=sc.nextInt();
		int year =day/365;
		int mon=day/12;
		int week=day/7;
		
		System.out.println("Days"+day);
		System.out.println("Year"+year);
		System.out.println("Month"+mon);
		System.out.println("Weeks"+week);

	}

}
