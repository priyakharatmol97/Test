package constructor;

import java.util.Scanner;

public class StudentUingRefAndMethodVariable
 {
	int id, marks;
	String name,dept;
	
	void setData(int i,String n,String d,int m)
	{
		id=i;
		name=n;
		dept=d;
		marks=m;
		
	}
	
	void display()
	{
		System.out.println(id+""+name+""+dept+""+marks);
	}

	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		System.out.println("Enter the name");
		String name=sc.next();
		
		System.out.println("Enter the dept");
		String dept=sc.next();
		
		System.out.println("Enter the marks");
		int marks=sc.nextInt();
		
		StudentUingRefAndMethodVariable s1=new StudentUingRefAndMethodVariable();
		
		s1.setData(id,name,dept,marks);
		
		
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		 id=sc.nextInt();
		
		System.out.println("Enter the name");
		 name=sc.next();
		
		System.out.println("Enter the dept");
		 dept=sc.next();
		
		System.out.println("Enter the marks");
		 marks=sc.nextInt();
		
		StudentUingRefAndMethodVariable s2=new StudentUingRefAndMethodVariable();
		
		s2.setData(id,name,dept,marks);
		System.out.println();
		
		System.out.println("--------Details About Student---------");
		s1.display();
		s2.display();
		
		
		

	}

}
