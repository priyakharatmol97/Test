package constructor;

import java.util.Scanner;

public class Student3 
{
	int id,m1,m2,m3,m4,m5,total;
	String name,dept;
	
	void setData(int id,String name,String dept,int m1,int m2,int m3,int m4,int m5)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+m1+" "+m2+" "+m3+" "+m4+" "+m5);
	}
	
	void total()	
	{
		this.total();
		total=m1+m2+m3+m4+m5;
		System.out.println("Total is:"+total);
	}
	
	void percent()
	{
		int percent=total/5;
		System.out.println("Percent is:"+percent);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student id");
		int id=sc.nextInt();
		System.out.println("Enter Student Name");
		String name=sc.next();
		System.out.println("Enter Student dept");
		String department=sc.next();
		System.out.println("Enter Student Marks1");
		int m1=sc.nextInt();
		System.out.println("Enter Student Marks2");
		int m2=sc.nextInt();
		System.out.println("Enter Student Marks3");
		int m3=sc.nextInt();
		System.out.println("Enter Student Marks4");
		int m4=sc.nextInt();
		System.out.println("Enter Student Marks5");
		int m5=sc.nextInt();
		System.out.println();
		
		Student2 s=new Student2();
		s.setData(id, name, department, m1, m2, m3, m4, m5);
		
		
		System.out.println("Enter Student id");
		id=sc.nextInt();
		System.out.println("Enter Student Name");
		name=sc.next();
		System.out.println("Enter Student dept");
		department=sc.next();
		System.out.println("Enter Student Marks1");
		m1=sc.nextInt();
		System.out.println("Enter Student Marks2");
		m2=sc.nextInt();
		System.out.println("Enter Student Marks3");
		m3=sc.nextInt();
		System.out.println("Enter Student Marks4");
		m4=sc.nextInt();
		System.out.println("Enter Student Marks5");
		m5=sc.nextInt();
		System.out.println();
		
		Student2 s2=new Student2();
		s2.setData(id, name, department, m1, m2, m3, m4, m5);
		
		
		System.out.println("Enter Student id");
		id=sc.nextInt();
		System.out.println("Enter Student Name");
		name=sc.next();
		System.out.println("Enter Student dept");
		department=sc.next();
		System.out.println("Enter Student Marks1");
		m1=sc.nextInt();
		System.out.println("Enter Student Marks2");
		m2=sc.nextInt();
		System.out.println("Enter Student Marks3");
		m3=sc.nextInt();
		System.out.println("Enter Student Marks4");
		m4=sc.nextInt();
		System.out.println("Enter Student Marks5");
		m5=sc.nextInt();
		System.out.println();
		
		
		Student2 s3=new Student2();
		s3.setData(id, name, department, m1, m2, m3, m4, m5);
		
		
		System.out.println("**------------Details About Students-----------**");
		System.out.println();
		
		s.display();
		s.total();
		s.percent();
		System.out.println();
		
		s2.display();
		s2.total();
		s2.percent();
		System.out.println();
		
		s3.display();
		s3.total();
		s3.percent();
		System.out.println();
		
		

	
	}

}
