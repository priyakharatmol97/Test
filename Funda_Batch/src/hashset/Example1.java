package hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Priya");
		hs.add("Navya");
		hs.add("Gauri");
		hs.add("Nivrutti");
		hs.add("Sushant");
		hs.add("Rushikesh");
		hs.add("Navya");
		
		System.out.println(hs);
		
		TreeSet<String> ts=new TreeSet<String>(hs);
		System.out.println(ts);
		
		
		
		

	}

}
