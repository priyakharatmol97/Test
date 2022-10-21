package project2;
import java.util.*;


public class BookMain 
{
	
		static void addBook(ArrayList<Book> al,Scanner sc)
		{
			String s=" ";
			do
			{
			System.out.println("Enter book id");
			int book_Id=sc.nextInt();
			
			System.out.println("Enter book name");
			String book_Name=sc.next();
			
			System.out.println("Enter book price");
			int book_Price=sc.nextInt();
			
			Book b=new Book(book_Id,book_Name,book_Price);
			System.out.println("Book Added");
			String st=sc.next();
			if(st.equalsIgnoreCase("Yes"))
			{
				viewBook(al,sc);
			}
			System.out.println("You want Add More Books");
			System.out.println("Y or N" );
			s=sc.next();
			
		}while(s.equalsIgnoreCase("Yes"));
		}
		
	static void removeBook(ArrayList<Book> al,Scanner sc)
	{
		String s=" ";
		do
		{
			int count=0;
			int length=al.size();
			System.out.println("Which One Book You Want to Remove");
			
			
			
			Iterator<Book> itr=al.iterator();
			while(itr.hasNext())
			{
				String book_Name1=sc.next();
		        if(itr.next().name.equals(book_Name1))
		        {
		        	itr.remove();
		        	System.out.println("Book Remove");
		        }
				else
				{
					count++;
				}
			}
			if(count>(length-1))
			{
				System.out.println("Sorry book not present");
			}
			System.out.println("You want to Remove Another Books");

			System.out.println("Y or N" );
			s=sc.next();
			
		}while(s.equalsIgnoreCase("Yes"));
	}
		
	static void updateBook(ArrayList<Book> al,Scanner sc)
	{ 
		String s=" ";
		do
		{
			int index=0;
			int count=0;
			int length=al.size();
			System.out.println("Which One Book You Want to Update");
			
			Object book_Name1=sc.next();
			
			Iterator<Book> itr=al.iterator();
			while(itr.hasNext())
			{
				//Book book_Name=itr.next();
		        if(itr.next().equals(book_Name1))
		        {
		        	index=al.indexOf(book_Name1);
		        	al.set(index, (Book) book_Name1);
		        	System.out.println("Book Updated");
		        }
				else
				{
					count++;
				}
			}
			if(count>(length-1))
			{
				System.out.println("Sorry book not present");
			}
			System.out.println("You want to Remove Another Books");
			System.out.println("Y or N" );
			s=sc.next();
			
		}while(s.equalsIgnoreCase("Yes"));
	}
	
	static void viewBook(ArrayList<Book> al,Scanner sc)
	{
		Iterator<Book> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
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
			
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("--------Book List Operations--------");
			System.out.println("1. Add a Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Update Book");
			System.out.println("4. View Book");
			System.out.println("5. Search Book");
			System.out.println("6. Sort Book");
			System.out.println("7. Exit");
			
			System.out.println("Please Choice Which Operation r u Performing");
			int choice=sc.nextInt();
			
			
			
			switch(choice)
			{
			case 1: addBook(al,sc);
			        break;
			
			case 2: removeBook(al,sc);
			        break;
			        
			        
			case 3: updateBook(al,sc);
	                break;
	                
	                
			case 4: viewBook(al,sc);
	                break;
	                
	                
			
			
			
			
			
		

	}
	
		}

		
}
