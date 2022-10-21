package assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class Q3 {

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
		
		Collections.reverse(al);
		System.out.println(al);

	}

}
