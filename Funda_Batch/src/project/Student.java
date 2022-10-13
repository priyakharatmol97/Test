package project;

import java.util.Scanner;

public class Student extends Transction
{
	int id;
	String name,emailId,dept,contact;
	
	void setData(int i,String n,String e,String d,String c)
	{
		id=i;
		name=n;
		emailId=e;
		dept=d;	
		contact=c;		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id");
		int id=sc.nextInt();
		
		System.out.println("Enter Student Name");
		String name=sc.next();
		
		System.out.println("Enter Student EmailId");
		String emailId=sc.next();
		
		System.out.println("Enter Student Department");
		String dept=sc.next();
		
		System.out.println("Enter Student ContactNumber");
		String contact=sc.next();
		
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+emailId+" "+dept+" "+contact);
	}

}
