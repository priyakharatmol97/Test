package overriding;

public class PEMain 
{

	public static void main(String[] args)
	{
		Manager m=new Manager();
		m.setPersonData("Priya","7977956202","Airoli");
		m.setEmployeeData(101, "Navya", "Infosys", "Computer");
		m.setManagerData(20000, "Computer Operator");
		m.display();
		m.display2();
		
		Employee e=new Employee();
		e.display2();
		
	}
}
