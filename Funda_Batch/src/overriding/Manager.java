package overriding;

public class Manager extends Employee
{
	int salary;
	String designation;
	
	void setManagerData(int salary,String designation)
	{
		this.salary=salary;
		this.designation=designation;
	}
	void display()
	{
		super.display();
		System.out.println(salary+" "+designation);
	}
	public Employee display2()
	{
		System.out.println("Inside Manager Class");
		return new Employee();
	}
	

}
