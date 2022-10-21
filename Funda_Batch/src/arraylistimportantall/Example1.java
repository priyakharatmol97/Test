package arraylistimportantall;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Priya");
		al.add("Navya");
		al.add("Vinod");
		al.add("Nayan");
		
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		System.out.println(al.removeAll(al));

	}

}
