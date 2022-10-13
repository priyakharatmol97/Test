package practiceall;

public class Employee2 extends Person
{
	int id,salary;
	String dept;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public String getDept()
	{
		return dept;
	}
	
	void calculatePf()
	{
		float pf=salary*0.15f;
		System.out.println(pf);
	}
	
	
	

}
