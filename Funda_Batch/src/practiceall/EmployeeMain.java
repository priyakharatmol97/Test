package practiceall;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		
		e.setId(101);
		e.setName("Priya");
		e.setDept("Computer");
		e.setSalary(20000);
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());

	}

}
