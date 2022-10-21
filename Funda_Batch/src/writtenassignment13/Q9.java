package writtenassignment13;

import java.util.TreeMap;

public class Q9 {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1, "Tv");
		tm.put(2, "Laptop");
		tm.put(3, "Fan");
		tm.put(4, "Freeze");
		tm.put(5, "Washing Machine");
		
		System.out.println(tm);
		
		System.out.println("----Check 1 St--------");
		System.out.println(tm.lowerKey(1));
		System.out.println("----Check 2 Nd--------");
		System.out.println(tm.lowerKey(2));
		System.out.println("----Check 3 Rd--------");
		System.out.println(tm.lowerKey(3));
		System.out.println("----Check 4 Th--------");
		System.out.println(tm.lowerKey(4));
		System.out.println("----Check 5 Th--------");
		System.out.println(tm.lowerKey(5));

	}

}
