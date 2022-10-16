package mock3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class DiffWayIterator {

	public static void main(String[] args)
	{
       HashMap<String,Integer> al=new HashMap<String,Integer>();
		
		al.put("mon",2);
		al.put("sat",6);
		al.put("sun",3);
		al.put("fri",9);
		al.put("tue",1);
		al.put("thus",8);
		al.put("wed",5);
		
		//System.out.println(al);
		
		System.out.println(al.containsKey(1));
		System.out.println(al.containsValue("mon"));

	}

}
