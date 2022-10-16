package practiceassignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class ItemMain {

	public static void main(String[] args)
	{
		Supplier s1=new Supplier(1,"Sushant","Pune");
		Supplier s2=new Supplier(2,"Nivrutii","Jalgaon");
		Supplier s3=new Supplier(3,"Gauri","Navi Mumbai");
		Supplier s4=new Supplier(4,"Priya","Airoli");
		Supplier s5=new Supplier(5,"Nishant","Thane");
		
		
		Item i1=new Item(101,"Milk",200,s1);
		Item i2=new Item(102,"Bread",100,s2);
		Item i3=new Item(103,"Cookies",300,s3);
		Item i4=new Item(104,"Coffee",600,s4);
		Item i5=new Item(105,"Sugar",800,s5);
		
		HashMap<String,ArrayList<String>>hs=new HashMap<String,ArrayList<String>>();
		HashSet<Item> hm=new HashSet<Item>();
		hm.add(i1);
		hm.add(i2);
		hm.add(i3);
		hm.add(i4);
		hm.add(i5);
		
		Iterator<Item>it=hm.iterator();
		
		while(it.hasNext())
		{
			Item item=it.next();
			
			if(hs.containsKey(item.i_name))
			{
				ArrayList<String> astr=hs.get(item.i_name);
				String name=item.s.s_name;
				astr.add(name);
				hs.put(item.i_name, astr);
			}
			else
			{
				ArrayList<String> astr=new ArrayList<String>();
				String name=item.s.s_name;
			     astr.add(name);
				String iname=item.s.s_name;
				hs.put(iname, astr);
			}
		}
		Set<Entry<String,ArrayList<String>>> set=hs.entrySet();
		
		for(Entry<String,ArrayList<String>> en:set)
		{
			System.out.println(en);
		}
		
		

	}

}
