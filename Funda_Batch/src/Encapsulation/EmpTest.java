package Encapsulation;

public class EmpTest {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.setId(101);
		e1.setSalary(20000);
		e1.setName("Priya");
		e1.setDept("Computer");
		e1.setContact("7977956202");
		System.out.println(e1.getId()+" "+e1.getSalary()+" "+e1.getName()+" "+e1.getDept()+" "+e1.getContact());

	}

}
