package writtenassignment13;

import java.util.HashMap;
import java.util.TreeMap;

public class Q5 {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1, "Pen");
		tm.put(2, "Pencil");
		tm.put(3, "NoteBook");
		tm.put(4, "Scale");
		tm.put(5, "Stick");
		System.out.println(tm);
		
		System.out.println("----Check 1 St--------");
		System.out.println(tm.headMap(1));
		System.out.println("----Check 2 Nd--------");
		System.out.println(tm.headMap(2));
		System.out.println("----Check 3 Rd--------");
		System.out.println(tm.headMap(3));
		System.out.println("----Check 4 Th--------");
		System.out.println(tm.headMap(4));
		System.out.println("----Check 5 Th--------");
		System.out.println(tm.headMap(5));
		

	}

}
