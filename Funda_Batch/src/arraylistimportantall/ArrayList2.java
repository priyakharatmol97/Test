package arraylistimportantall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");
		
		Collections.sort(al);
		System.out.println(al);
		
		// System.out.println("Enter Day");
		String day=sc.next();
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext())
		{itr.next();
			
				itr.remove();
			
		}
		
		System.out.println(al);

	}
}
