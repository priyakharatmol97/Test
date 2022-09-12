package classandobjects;

import java.util.Scanner;

public class Employee 
{
	int id,salary;
	String contact,name,department;
	
	void setData(int i,String n,String c,String d,int s)
	{
		id=i;
		name=n;
		contact=c;
		department=d;	
		salary=s;		
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+contact+" "+department+" "+salary);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name");
		String name=sc.next();
		System.out.println("Enter Employee contact");
		String contact=sc.next();
		System.out.println("Enter Employee department");
		String department=sc.next();
		System.out.println("Enter Employee salary");
		int salary=sc.nextInt();
		System.out.println();
		
		Employee e1=new Employee();
		e1.setData(id,name,contact,department,salary);
		
		
		System.out.println("Enter Employee id");
		id=sc.nextInt();
		System.out.println("Enter Employee Name");
		name=sc.next();
		System.out.println("Enter Employee contact");
		contact=sc.next();
		System.out.println("Enter Employee department");
		department=sc.next();
		System.out.println("Enter Employee salary");
		salary=sc.nextInt();
		System.out.println();
		
		
		Employee e2=new Employee();
		e2.setData(id,name,contact,department,salary);
		
		
		System.out.println("Enter Employee id");
		id=sc.nextInt();
		System.out.println("Enter Employee Name");
		name=sc.next();
		System.out.println("Enter Employee contact");
		contact=sc.next();
		System.out.println("Enter Employee department");
		department=sc.next();
		System.out.println("Enter Employee salary");
		salary=sc.nextInt();
		System.out.println();
		
		
		
		Employee e3=new Employee();
		e3.setData(id,name,contact,department,salary);
		
		System.out.println("Enter Employee id");
		id=sc.nextInt();
		System.out.println("Enter Employee Name");
		name=sc.next();
		System.out.println("Enter Employee contact");
		contact=sc.next();
		System.out.println("Enter Employee department");
		department=sc.next();
		System.out.println("Enter Employee salary");
		salary=sc.nextInt();
		System.out.println();
		
		Employee e4=new Employee();
		e4.setData(id,name,contact,department,salary);
		
		System.out.println("Enter Employee id");
		id=sc.nextInt();
		System.out.println("Enter Employee Name");
		name=sc.next();
		System.out.println("Enter Employee contact");
		contact=sc.next();
		System.out.println("Enter Employee department");
		department=sc.next();
		System.out.println("Enter Employee salary");
		salary=sc.nextInt();
		System.out.println();
		
		Employee e5=new Employee();
		e5.setData(id,name,contact,department,salary);
		System.out.println();
		
		System.out.println("------------Details About Employee-----------");
		System.out.println();
		
		e1.display();
		System.out.println();
		e2.display();
		System.out.println();
		e3.display();
		System.out.println();
		e4.display();
		System.out.println();
		e5.display();
		System.out.println();
		
		
		
		
		

	}

}
