package writtenassignment13;

import java.util.TreeMap;

public class Q6 {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(10, "Sunita");
		tm.put(20, "Balika");
		tm.put(30, "Najuka");
		tm.put(40, "Drowpadi");
		tm.put(50, "Priya");
		System.out.println(tm);
		
		System.out.println("----Check 1 St--------");
		System.out.println(tm.headMap(10, true));
		System.out.println("----Check 2 Nd--------");
		System.out.println(tm.headMap(20, true));
		System.out.println("----Check 3 Rd--------");
		System.out.println(tm.headMap(30, true));
		System.out.println("----Check 4 Th--------");
		System.out.println(tm.headMap(40, true));
		System.out.println("----Check 5 Th--------");
		System.out.println(tm.headMap(50, true));

	}

}
