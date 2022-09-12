package statickeyword;

import java.util.Scanner;

public class Employee
{
	int id,salary;
	String name;
	static String compName="TCS";
	
	static
	{
		compName="TCS Pune";
		System.out.println("Static Block 1");
	}
	
	static
	{
		System.out.println("Static Block 2");
	}
	
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	static void companyInfo()
	{
		System.out.println("Good Company...One of The Top Most Companies");
		System.out.println(compName);
		Employee emp=new Employee(100,"Najuka",90000);
		System.out.println(emp.id+" "+emp.name+" "+emp.salary+" "+compName);
		System.out.println(emp.salary);
		
	}
	
	/*public String toString()
	{
		return id+" "+name+" "+salary;
	}*/
	
	void display()
	{
		System.out.println(id+" "+name+" "+salary+" "+compName);
		show();
		companyInfo();
	}
	
	void show()
	{
		System.out.println("Inside show method");
		
	}

	public static void main(String[] args) 
	{

		Employee e1=new Employee(101,"Priya",20000);
		System.out.println(Employee.compName);
		Employee e2=new Employee(102,"Nayan",30000);
		System.out.println();
		Employee.companyInfo();	
		System.out.println(e1);
		System.out.println(e2);
		
		

	}

}
