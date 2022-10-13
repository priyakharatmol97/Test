package practiceassignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DeleteEntry {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> hash=new HashMap<>();
		hash.put(1, "Mumbai");
		hash.put(2, "Pune");
		hash.put(3, "Nagpur");
		hash.put(4, "Satara");
		hash.put(5, "Kolhapur");
		
		for(Map.Entry<Integer, String> map : hash.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
			
		}
		
		
		System.out.println("Which You Want To Delete Entry");
		String s=sc.next();
	    Iterator<Map.Entry<Integer, String> > itr = hash.entrySet().iterator();
     
	    //String value=hash.remove(itr);
	    while(itr.hasNext()) 
	    {
	    	Map.Entry<Integer, String> entry = itr.next();
	    	if(s.equals(entry.getValue())) 
	    	{
	    		itr.remove();
	    	}
	    }
	    
	    Iterator<Map.Entry<Integer, String>> ss = hash.entrySet().iterator();
	    while(ss.hasNext()) 
	    {
	    	Map.Entry<Integer, String> entry = ss.next();
	    	System.out.println(entry.getKey()+ " "+entry.getValue());
	    	
	    }
		
		

	}

}
