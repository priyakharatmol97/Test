package assignment2;

import java.util.Iterator;
import java.util.Stack;

public class Item 
{
	int itemid;
	String itemName;
	
	Item(int itemid,String itemName)
	{
		this.itemid=itemid;
		this.itemName=itemName;
	}
	
	public String toString()
	{
		return itemid+" "+itemName;
	}

	public static void main(String[] args)
	{
		Stack<Item> s=new Stack<Item>();
		Item i1=new Item(101,"Biryani");
		Item i2=new Item(102,"Dal");
		Item i3=new Item(103,"Rice");
		Item i4=new Item(104,"MisalPaav");
		
		s.push(i1);
		s.push(i2);
		s.push(i3);
		s.push(i4);
		System.out.println(s);
		
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
		
		

		

	}

}
