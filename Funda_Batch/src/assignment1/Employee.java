package assignment1;

import java.util.ArrayList;

public class Employee 
{
	int id,sal;
	String name;
	
	Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public String toString()
	{
		return id+" "+name+" "+sal;
	}

	public static void main(String[] args) 
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee e1=new Employee(1,"Priya",10000);
		Employee e2=new Employee(2,"Gauri",20000);
		Employee e3=new Employee(3,"Nivrutti",40000);
		Employee e4=new Employee(4,"Sushant",70000);
		Employee e5=new Employee(5,"Rushikesh",50000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		System.out.println(al);

	}

}
