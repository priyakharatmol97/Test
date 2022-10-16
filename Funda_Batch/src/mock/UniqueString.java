package mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class UniqueString {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("mon");
		al.add("mon");
		al.add("tue");
		al.add("mon");
		al.add("tue");
		al.add("mon");
		al.add("wed");
		al.add("Ashu");
		
		System.out.println(al);
		
		LinkedHashSet<String>ll=new LinkedHashSet<String>(al);
		//System.out.println(ll);
		
		TreeSet<String> ts=new TreeSet<String>(al);
		//System.out.println(ts);
		
		Collections.sort(al);
		//System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		al.indexOf(ts);
		System.out.println(al);
		
		for(String s:al)
		{
			if(s.contains("Ashu"))
			{
				System.out.println(s);
			}
		}
		

	}

}
