package collection;

import java.util.ArrayList;

public class EmployeeQ5 
{
	int id;
	int sal;
	String name;
	
	public EmployeeQ5(int id,String name, int sal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.sal=sal;
	}
	
	public String toString() 
	{
		return "EmployeeQ5 [id=" + id + ", name=" + name + ", salary=" + sal + "]";
	}

	public static void main(String[] args) 
	{
		EmployeeQ5 e1=new EmployeeQ5(1,"Priya",10000);
		EmployeeQ5 e2=new EmployeeQ5(2,"Ankush",20000);
		EmployeeQ5 e3=new EmployeeQ5(3,"Anand",30000);
		EmployeeQ5 e4=new EmployeeQ5(4,"Navya",40000);
		EmployeeQ5 e5=new EmployeeQ5(5,"Swara",50000);
		
		ArrayList<EmployeeQ5> al=new ArrayList<EmployeeQ5>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		System.out.println(al);

	}

}
