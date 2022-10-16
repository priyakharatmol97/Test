package mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Book 
{
	int id,price;
	String name;
	
	Book(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public String toString()
	{
		return id+" "+name+" "+price;
	}


	
	public static void main(String[] args) 
	{
		Book b1=new Book(1,"Java",300);
		Book b2=new Book(2,"MySql",200);
		Book b3=new Book(3,"QA",250);
		Book b4=new Book(4,".Net",500);
		Book b5=new Book(5,"Data Structure",400);
		
		ArrayList<Book> al=new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		
		System.out.println(al);
		
		al.remove(b1);
		System.out.println(al);
		
		al.set(0, b1);
		System.out.println(al);
		
		
		System.out.println(al);
		
		al.contains(b5);
		System.out.println(al);
		
	
		
	}

}


