package arraylistpractice;

import java.util.ArrayList;

public class Book 
{
	int id;
	String name;
	
	Book(int id,String name)
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
		Book b1=new Book(1,"Java");
		Book b2=new Book(2,"Mysql");
		Book b3=new Book(3,"C++");
		
		ArrayList<Book> al=new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		//System.out.println(al);
		for(Book b:al)
		{
			System.out.println(b.id+" "+b.name);
		}

	}

}
