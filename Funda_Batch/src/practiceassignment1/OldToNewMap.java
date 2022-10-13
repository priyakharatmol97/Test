package practiceassignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OldToNewMap {

	public static void main(String[] args)
	{
		HashMap<Integer,Character> hm=new HashMap<Integer,Character>();
		hm.put(1,'a');
		hm.put(2,'b');
		hm.put(3,'c');
		hm.put(4,'b');
		hm.put(5,'a');
		hm.put(6,'a');
		
		
		HashMap<Character,Integer> newmap=new HashMap<Character,Integer>();
		Set<Entry<Integer,Character>> st=hm.entrySet();
		
		int count=0;
		Character c='0';
		
		for(Map.Entry m:st)
		{
			c=(Character)m.getValue();
			System.out.println(c);
			
			if(newmap.containsKey(c))
			{
				count=newmap.get(c);
				System.out.println(count);
				count=count+1;
			}
			else
				count=1;
			newmap.put(c, count);
		}
		for(Map.Entry entry:newmap.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
		
	}
		
}
		
		


	
