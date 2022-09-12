package constructor;

import java.util.Scanner;

public class Employee2 
{
	int id,oldsalary,newsalary,total;
	String name,department,rating;
	
	void setData(int i,String n,String d,int o,int ne,String r)
	{
		id=i;
		name=n;
		department=d;	
		oldsalary=o;	
		newsalary=ne;
		rating=r;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+department+" "+oldsalary+" "+newsalary+" "+rating);
	}
	
	void bonusCal()
	{
		float bonussalary;	
	
		if(rating.equals("A"))
		{
			bonussalary=oldsalary+(newsalary/100*20);
			System.out.println("Bonus is:"+bonussalary);
		}
		

		else if(rating.equals("B"))
		{
			bonussalary=oldsalary+(newsalary/100*15);
			System.out.println("Bonus is:"+bonussalary);
		}
		
		else if(rating.equals("C"))
		{
			bonussalary=oldsalary+(newsalary/100*10);
			System.out.println("Bonus is:"+bonussalary);
		}
		
		else
		{
			System.out.println("No Salary Bonus");
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name");
		String name=sc.next();
		System.out.println("Enter Employee dept");
		String department=sc.next();
		System.out.println("Enter Employee old salary");
		int oldsalary=sc.nextInt();
		System.out.println("Enter Employee new salary");
		int newsalary=sc.nextInt();
		System.out.println("Enter rating");
		String r=sc.next();
		System.out.println();
		
		Employee2 e2=new Employee2();
		e2.setData(id,name,department ,oldsalary,newsalary,r);
		
		
		
		
		System.out.println("Enter Employee id");
		id=sc.nextInt();
		System.out.println("Enter Employee Name");
		name=sc.next();
		System.out.println("Enter Employee dept");
		department=sc.next();
		System.out.println("Enter Employee old salary");
		oldsalary=sc.nextInt();
		System.out.println("Enter Employee new salary");
		newsalary=sc.nextInt();
		System.out.println("Enter rating");
		r=sc.next();
		System.out.println();
		
		
		Employee2 e3=new Employee2();
		e3.setData(id,name,department ,oldsalary,newsalary,r);
		
		
		
		
		
		System.out.println("------------Details About Employee-----------");
		System.out.println();
		
		e2.display();
		e2.bonusCal();
		System.out.println();
		
		e3.display();
		e3.bonusCal();
		
		
		
		

	}

}
