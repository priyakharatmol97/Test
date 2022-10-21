package arraylistexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Example1 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbbchd");
		al.add("ccc");
		al.add("eee");
		al.add("ddd");
		al.add("eee");
		al.add("bbbchd");
		
		
		System.out.println(al);

		
		System.out.println("Sort");
		Collections.sort(al);
		System.out.println(al);
		
		
		System.out.println("Unique");
		LinkedHashSet<String> ll=new LinkedHashSet<String>(al);
		System.out.println(ll);
		
		al.set(2, "priya");
		System.out.println(al);
		
		
		
		
	}

}
