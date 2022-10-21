package writtenassignment13;

import java.util.TreeMap;

public class Q7 {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(10, "Red");
		tm.put(20, "White");
		tm.put(30, "Pink");
		tm.put(40, "Black");
		tm.put(50, "Purple");
		System.out.println(tm);
		
		System.out.println("----Check 1 St--------");
		System.out.println(tm.higherKey(10));
		System.out.println("----Check 2 Nd--------");
		System.out.println(tm.higherKey(20));
		System.out.println("----Check 3 Rd--------");
		System.out.println(tm.higherKey(30));
		System.out.println("----Check 4 Th--------");
		System.out.println(tm.higherKey(40));
		System.out.println("----Check 5 Th--------");
		System.out.println(tm.higherKey(50));
		System.out.println("----Check 6 Th--------");
		System.out.println(tm.higherKey(60));

	}

}
