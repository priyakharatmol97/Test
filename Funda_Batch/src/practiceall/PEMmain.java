package practiceall;

import java.util.Scanner;

public class PEMmain {

	public static void main(String[] args) 
	{
		Employee2 e=new Employee2();
		e.setId(1);
		e.setAge(34);
		e.setContact("7977956202");
		e.setAddress("Airoli");
		e.setDept("Electronic");
		e.setName("priya");
		e.setSalary(20000);
		
		System.out.println(e.getName()+" "+e.getDept()+" "+e.getAge()+" "+e.getSalary());
		e.calculatePf();
		
		
		

	}

}
