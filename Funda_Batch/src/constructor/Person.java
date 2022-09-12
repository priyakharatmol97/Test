package constructor;

import java.util.Scanner;

public class Person 
{
	int id,age;
	String name,contact,address,email;
	
	Person(int i,String n,int a,String c,String e,String ad)
	{
		id=i;
		name=n;
		age=a;
		contact=c;
		email=e;
		address=ad;	
	}
	
	public String toString()
	{
		return id+" "+name+" "+age+" "+contact+" "+email+" "+address;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+age+" "+contact+" "+email+" "+address);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Person Id :");
		int id=sc.nextInt();
		System.out.println("Enter Person Name:");
		String name=sc.next();
		System.out.println("Enter Person Age:");
		int age=sc.nextInt();
		System.out.println("Enter Person Contact:");
		String contact=sc.next();
		System.out.println("Enter Person Email:");
		String email=sc.next();
		System.out.println("Enter Person Address:");
		String address=sc.next();
		Person p1=new Person(id,name,age,contact,email,address);
		
		
		
		System.out.println("Enter Person Id :");
		id=sc.nextInt();
		System.out.println("Enter Person Name:");
		name=sc.next();
		System.out.println("Enter Person Age:");
		age=sc.nextInt();
		System.out.println("Enter Person Contact:");
		contact=sc.next();
		System.out.println("Enter Person Email:");
		email=sc.next();
		System.out.println("Enter Person Address:");
		address=sc.next();
		Person p2=new Person(id,name,age,contact,email,address);
		
		
		System.out.println("Enter Person Id :");
		id=sc.nextInt();
		System.out.println("Enter Person Name:");
		name=sc.next();
		System.out.println("Enter Person Age:");
		age=sc.nextInt();
		System.out.println("Enter Person Contact:");
		contact=sc.next();
		System.out.println("Enter Person Email:");
		email=sc.next();
		System.out.println("Enter Person Address:");
		address=sc.next();
		Person p3=new Person(id,name,age,contact,email,address);
		
		System.out.println("-------Details About Perons-------");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		

	}

}
