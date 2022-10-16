package project;

import java.util.Scanner;

public class Project 
{
	public static void main(String[] args) 
	{
		char r;
		do
		{
		System.out.println("* * * * * Library Management System * * * * *");
		System.out.println("Press 1 to Add Book");
		System.out.println("Press 2 to Issue a Book");
		System.out.println("Press 3 to Return a Book");
		System.out.println("Press 4 to Print Complete Issue Details");
		System.out.println("Press 5 to Exit");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int book_Id=sc.nextInt();
		switch(book_Id)
		{
		case 1:
			Library l1=new Library();
			l1.addBook();
			break;
			
		case 2: 
			Library l2=new Library();
			l2.issueBook();
			break;
			
		case 3:
			Library l3=new Library();
			l3.returnBook();
			break;
			
		case 4:
			Library l4=new Library();
			l4.detail();
			break;
			
		case 5:
			Library l5=new Library();
			l5.exit();
			break;
			
		default:
			System.out.println("Invalid Number");
		}
		
		System.out.println("You Want to Select Next Option..? Y/N");
		r=sc.next().charAt(0);
		}
		while(r=='y' || r=='Y');
		
		
	
		if(r=='n' || r=='N')
		{
			Library l=new Library();
			l.exit();
		}
		}
	}
	
class Library
{
	static String bookName,issue_Date,return_book_Date;
	static int bookNo,book_Id,number_Of_Book_Issued;
	static float bookPrice;
	
	void addBook()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Name");
		String bookName=sc.nextLine();
		
		System.out.println("Enter Book Price");
		float bookPrice=sc.nextFloat();
		
		System.out.println("Enter Book_No");
		int bookNo=sc.nextInt();
		
		System.out.println("Details Is:"+bookName+" "+bookPrice+" "+bookNo);
	}
	
	
	void issueBook()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Book Name");
		bookName=sc.nextLine();
		
		System.out.println("Book_Id");
		book_Id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Issue Date");
		issue_Date=sc.nextLine();
		
		System.out.println("Total Number of Book Issued");
		number_Of_Book_Issued=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Return Book Date");
		return_book_Date=sc.next();
		sc.nextLine();
	}
	int getbookId()
	{
		return book_Id;
	}
	
	void returnBook()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student_Name & book_Id");
		String name=sc.nextLine();
		int book_Id=sc.nextInt();
		
		if(book_Id==book_Id)
		{
			System.out.println("Total Details");
			System.out.println("Book Name:"+Library.bookName);
			System.out.println("Book Id:"+Library.book_Id);
			System.out.println("Issue Date:"+Library.issue_Date);
			System.out.println("Total Number Of Book Issued:"+Library.number_Of_Book_Issued);
			System.out.println("Book Return Date:"+Library.return_book_Date);
		}
		else
		{
			System.out.println("Wrong Id, Please Enter a Valid Id");
		}
	}
	void detail()
	{
		System.out.println("Book Name:"+Library.bookName);
		System.out.println("Book Id:"+Library.book_Id);
		System.out.println("Issue Date:"+Library.issue_Date);
		System.out.println("Total Number Of Book Issued:"+Library.number_Of_Book_Issued);
		System.out.println("Book Return Date:"+Library.return_book_Date);
	}
	
	void exit()
	{
		System.exit(0);
	}
}




