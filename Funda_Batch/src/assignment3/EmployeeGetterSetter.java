package assignment3;

import java.util.Scanner;

public class EmployeeGetterSetter 
{
	int emp_id,sal;
	String name;
	
	
	EmployeeGetterSetter()
	{
		emp_id=00;
		sal=000000;
		name="name";	
	}
	
	
	EmployeeGetterSetter(int i,int s,String n)
	{
		emp_id=i;
		sal=s;
		name=n;
		
	}
	
	public String toString()
	{
		return emp_id+" "+sal+" "+name;
	}
	
	
	void display()
	{
		System.out.println(emp_id+" "+sal+" "+name);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp_id");
		int emp_id=sc.nextInt();
		System.out.println("Enter emp salary");
		int sal=sc.nextInt();
		System.out.println("Enter emp name");
		String name=sc.next();
		EmployeeGetterSetter e1=new EmployeeGetterSetter();
		
		System.out.println("Enter emp_id");
		emp_id=sc.nextInt();
		System.out.println("Enter emp salary");
		sal=sc.nextInt();
		System.out.println("Enter emp name");
		name=sc.next();
		EmployeeGetterSetter e2=new EmployeeGetterSetter(emp_id,sal,name);
		System.out.println();
		
		
		System.out.println("**------Details About The Employee-------**");
		System.out.println();
		
		System.out.println(e1);
		System.out.println(e2);	

	}

}

/*Output:
 Enter emp_id
101
Enter emp salary
20000
Enter emp name
Priya
Enter emp_id
102
Enter emp salary
30000
Enter emp name
Nayan

**------Details About The Employee-------**

0 0 name
102 30000 Nayan
*/
