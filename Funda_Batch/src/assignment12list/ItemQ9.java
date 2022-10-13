package assignment12list;

import java.util.Stack;

public class ItemQ9 
{
	public static void main(String[] args) 
	{
		
		Item i1=new Item(1,"Apple");
		Item i2=new Item(2,"Strawberry");
		Item i3=new Item(3,"Banana");
		
		Stack<Item> st=new Stack<Item>();
		
		st.add(i1);
		st.add(i2);
		st.add(i3);
		
		
		System.out.println(st.push(i1));
		System.out.println(st.push(i2));
		System.out.println(st.push(i3));
		//System.out.println(st.empty());
		
		
		System.out.println("--------------");
		for (int i = 0; i < 3; i++) 
		{
			System.out.println(st.pop());
			//System.out.println(st.peek());
		}
		//System.out.println(st.empty());
       
		
	}
}