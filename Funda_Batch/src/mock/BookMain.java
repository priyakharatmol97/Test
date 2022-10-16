package mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import project2.Book;

public class BookMain
{
	

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
		
		
		System.out.println(al);
		
	}

}
