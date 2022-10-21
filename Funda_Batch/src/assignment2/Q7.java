package assignment2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q7 {

	public static void main(String[] args) 
	{
		LinkedList<String>al=new LinkedList<String>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");
		
		System.out.println(al);
		
		ArrayList<String>al2=new ArrayList<String>(al);
		for(String s:al2)
		{
			System.out.println(s);
		}
		

	}

}
