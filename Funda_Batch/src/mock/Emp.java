package mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Emp
{
	int id,sal;
	String name;
	
	Emp(int id,String name,int sal)
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
		ArrayList<Emp> al=new ArrayList<Emp>();
		Emp e1=new Emp(1,"Priya",2000);
		Emp e2=new Emp(2,"Priya",2000);
		Emp e3=new Emp(3,"Priya",2000);
		Emp e4=new Emp(4,"Anand",2000);
		Emp e5=new Emp(5,"Priya",2000);
		
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		
		System.out.println(al);
		
		

	}

}
