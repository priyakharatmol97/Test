package practiceassignment1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DifferentWayOfMap {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(4, "Nivrutti");
		hm.put(2, "Sushant");
		hm.put(3, "Priya");
		hm.put(1, "Gauri");
		System.out.println("Original KeyValue");
		System.out.println(hm);
		System.out.println();
		
		
		System.out.println("----Basis On Keys----");
		Collection c1=hm.keySet();
		System.out.println(c1);
		System.out.println();
		
		System.out.println("----Basis On Values----");
		Collection c=hm.values();
		System.out.println(c);
		System.out.println();
		
		System.out.println("----Basis On KeyValuePair----");
		Set<Entry<Integer,String>> entry=hm.entrySet();
		System.out.println(entry);
		System.out.println();
		



	}

}
