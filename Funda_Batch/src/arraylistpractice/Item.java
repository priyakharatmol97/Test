package arraylistpractice;

import java.util.ArrayList;

public class Item 
{
	int id;
	String name;
	
	Item(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id+" "+name;
	}

	public static void main(String[] args) 
	{
		Item i1=new Item(1,"Milk");
		Item i2=new Item(2,"Sugar");
		Item i3=new Item(3,"Bread");
		
		ArrayList<Item> al=new ArrayList<Item>();
		al.add(i1);
		al.add(i2);
		al.add(i3);
		
		for(Item i:al)
		{
			System.out.println(i.id+" "+i.name);
		}

		
		//System.out.println(al.size());
		
		//System.out.println(al.contains(i1)); //true or false
		
		//System.out.println(al.containsAll(al));
		al.remove(2);
		System.out.println(al);

	}

}
