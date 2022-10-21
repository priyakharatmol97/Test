package assignment2;

import java.util.ArrayList;

public class Q4 {

	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList<String>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");
		
		System.out.println(al);
		
		//al.subList(0, 2);
		System.out.println(al.subList(0, 2));
	}

}
