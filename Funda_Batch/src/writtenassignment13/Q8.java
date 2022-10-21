package writtenassignment13;

import java.util.TreeMap;

public class Q8 {

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
		System.out.println(tm.lowerEntry(10));
		System.out.println("----Check 2 Nd--------");
		System.out.println(tm.lowerEntry(20));
		System.out.println("----Check 3 Rd--------");
		System.out.println(tm.lowerEntry(30));
		System.out.println("----Check 4 Th--------");
		System.out.println(tm.lowerEntry(40));
		System.out.println("----Check 5 Th--------");
		System.out.println(tm.lowerEntry(50));

	}

}
