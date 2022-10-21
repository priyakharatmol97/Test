package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Q1 {

	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList<String>();
		al.add("sun");
		al.add("mon");
		al.add("sun");
		al.add("tue");
		al.add("wed");
		al.add("mon");
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		LinkedHashSet<String>ll=new LinkedHashSet<String>(al);
		System.out.println(ll);
		
		

	}

}
