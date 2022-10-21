package writtenassignment13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapValue {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hs1=new HashMap<Integer,String>();
		hs1.put(1, "Milk");
		HashMap<Integer,String> hs2=new HashMap<Integer,String>();
		hs2.put(2, "Sugar");
		HashMap<Integer,String> hs3=new HashMap<Integer,String>();
		hs3.put(3, "Coffee");
		HashMap<Integer,String> hs4=new HashMap<Integer,String>();
		hs4.put(4, "Butter");
		
		
		HashMap<Integer,HashMap<Integer,String>> hs=new HashMap<Integer,HashMap<Integer,String>>();
		hs.put(1, hs1);
		hs.put(2, hs2);
		hs.put(3, hs3);
		hs.put(4, hs4);
		
		Set<Entry<Integer,HashMap<Integer,String>>>   set= hs.entrySet();
        
        for(Map.Entry<Integer,HashMap<Integer,String>> map:set)
        {
           HashMap<Integer, String> i=map.getValue();
           System.out.println(i);
           
           Integer hmap=map.getKey();
           System.out.println(hmap);
     }

	}

}
